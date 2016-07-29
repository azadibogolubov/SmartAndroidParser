# SmartAndroidParser
This is a transpiler which will generate Android XML using a DSL to simplify the process of writing boilerplate code.

Sample script entries include:

[Button | TextView | EditText | ListView ] 

[RelativeLayout | LinearLayout ] 

A valid script might look like the following:
```
LinearLayout 
	Button 
	Textview 
 	RelativeLayout 
		Button 
		Button 
```

This will ideally generate the following XML:

```xml
<LinearLayout
	android:layout_width="wrap_content"
	android:layout_height="wrap_content"
	android:id="@+id/rootLayout">

	<Button
		android:layout_width="wrap_content"
		android:layout_height="wrap_content" />

	<TextView
		android:layout_width="wrap_content"
		android:layout_height="wrap_content" />

	<RelativeLayout
		android:layout_width="wrap_content"
		android:layout_height="wrap_content"
		android:id="@+id/relativeLayout" >

		<Button
			android:layout_width="wrap_content"
			android:layout_height="wrap_content" />

		<Button
			android:layout_width="wrap_content"
			android:layout_height="wrap_content" />
	</RelativeLayout>
<LinearLayout>	
```

The idea would be to create a program where you can feed in syntax such as that above, and be able to have it spit out an equivalent Java file that can be used in Eclipse or Android Studio.
