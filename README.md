# SmartAndroidParser
This is a transpiler which will generate Android XML using a DSL to simplify the process of writing boilerplate code.

Supported XML types at this time include:  
Button  
TextView  
EditText  
RelativeLayout  
LinearLayout  
FrameLayout  
RecyclerView  
FAB  
Dialog - Generates a boilerplate dialog  

Supported Java tags are as follows:  
NewActivity  
OnCreate  
Click  
End  

There are sample scripts available in the testFiles folder.

To run these, use:  
```
./makeparser.sh  
```

Enter the file name from testFiles (just the file name, the directory path is coded into the shell script).  

A valid script might look like the following:
```
-- someFile.xml
LinearLayout someId
~ Button someId "some text"
~ Textview someId "some text"
\ RelativeLayout someId
~ Button someId "some text"
~ Button someId "some text" Margin,10,20,10,20
/
/
```

Will generate the following XML, as someFile.xml in the current directory:

```xml
<LinearLayout
	android:layout_width="wrap_content"
	android:layout_height="wrap_content"
	android:id="@+id/rootLayout">

	<Button
		android:id="@+id/someId"
		android:layout_width="wrap_content"
		android:layout_height="wrap_content" 
		android:text="some text" />

	<TextView
		android:id="@+id/someId"
		android:layout_width="wrap_content"
		android:layout_height="wrap_content" 
		android:text="some text" />

	<RelativeLayout
		android:id="@+id/someId"
		android:layout_width="wrap_content"
		android:layout_height="wrap_content"
		android:id="@+id/relativeLayout" >

		<Button
			android:id="@+id/someId"
			android:layout_width="wrap_content"
			android:layout_height="wrap_content"
			android:text="some text" />

		<Button
			android:id="@+id/someId"
			android:layout_width="wrap_content"
			android:layout_height="wrap_content"
			android:text="some text"
			android:layout_marginLeft="10dp"
			android:layout_marginTop="20dp" 
			android:layout_marginRight="20dp"
			android:layout_marginBottom="10dp"/>
	</RelativeLayout>
</LinearLayout>	
```

The idea would be to create a program where you can feed in syntax such as that above, and be able to have it spit out an equivalent Java file that can be used in Eclipse or Android Studio.
