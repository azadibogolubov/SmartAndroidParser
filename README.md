# SmartAndroidParser
This is a parser which will be similar in nature to Scaloid, but produces pure Java.
UPDATE: 5/29/2015
CFG in progess.

Sample script entries include:

[Button | TextView | EditText | ListView ] someVarName someId "some text"

[RelativeLayout | LinearLayout ] someVarName someId 

A valid script might look like the following:
LinearLayout rootLayout rootLayout
	Button someBtn btn1 "I'm a button"
	Textview tv tv1 "I'm a textview"
 	RelativeLayout nestedLayout relativeLayout
		Button okBtn btn2 "OK"
		Button cancelBtn btn3 "Cancel"

This will ideally generate the following XML:
<LinearLayout
	android:layout_width="wrap_content"
	android:layout_height="wrap_content"
	android:id="@+id/rootLayout">

	<Button
		android:layout_width="wrap_content"
		android:layout_height="wrap_content"
		android:id="@+id/btn1" 
		android:text="I'm a button" />

	<TextView
		android:layout_width="wrap_content"
		android:layout_height="wrap_content"
		android:id="@+id/btn2"
		android:text="I'm a textview" />

	<RelativeLayout
		android:layout_width="wrap_content"
		android:layout_height="wrap_content"
		android:id="@+id/relativeLayout" >

		<Button
			android:layout_width="wrap_content"
			android:layout_height="wrap_content"
			android:id="@+id/btn2"
			android:text="OK" />

		<Button
			android:layout_width="wrap_content"
			android:layout_height="wrap_content"
			android:id="@+id/btn3"
			android:text="Cancel" />
	</RelativeLayout>
<LinearLayout>		

The idea would be to create a program where you can feed in syntax such as that above, and be able to have it spit out an equivalent Java file that can be used in Eclipse or Android Studio.
