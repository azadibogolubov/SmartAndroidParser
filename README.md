# SmartAndroidParser
This is a transpiler which will generate Android XML using a DSL to simplify the process of writing boilerplate code.

Sample script entries include:

[Button | TextView | EditText | ListView ] 

[RelativeLayout | LinearLayout ] 

A valid script might look like the following:
```
LinearLayout someId
	Button someId "some text"
	Textview someId "some text"
 	RelativeLayout someId
		Button someId "some text"
		Button someId "some text"
```

This will ideally generate the following XML:

```xml
<LinearLayout
	android:layout_width="wrap_content"
	android:layout_height="wrap_content"
	android:id="@+id/rootLayout">

	<Button
		android:layout_width="wrap_content"
		android:layout_height="wrap_content" 
		android:text="some text" />

	<TextView
		android:layout_width="wrap_content"
		android:layout_height="wrap_content" 
		android:text="some text" />

	<RelativeLayout
		android:layout_width="wrap_content"
		android:layout_height="wrap_content"
		android:id="@+id/relativeLayout" >

		<Button
			android:layout_width="wrap_content"
			android:layout_height="wrap_content"
			android:text="some text" />

		<Button
			android:layout_width="wrap_content"
			android:layout_height="wrap_content"
			android:text="some text" />
	</RelativeLayout>
<LinearLayout>	
```

The idea would be to create a program where you can feed in syntax such as that above, and be able to have it spit out an equivalent Java file that can be used in Eclipse or Android Studio.
