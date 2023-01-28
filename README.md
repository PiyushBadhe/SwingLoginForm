# SwingLoginForm

![Generic badge](https://img.shields.io/badge/Language-JAVA-brightgreen) ![Generic badge](https://img.shields.io/badge/SWING-GUI-blue)

<p>
    <strong>Problem Statement:</strong> To create a functional login GUI that enables users to enter login credentials and, upon verification, respond accordingly.<br>
    With the help of the CANCEL button, users can terminate login and exit the GUI.
</p>

**Features:**

- Individual input text fields for both username and password
- Cancel button to terminate login and exit application    
- Login button to let user log-in
- Close application button (default swing button)


> Taking this idea into code, a best way to create and place the components is to use `GridLayout` of 3 rows and 2 columns as per the UI Layout idea shown below
>> | Column1 | Column2 |
>> | :---------- | :------------ |
>> | Row1-Label1 | Row1-TextField1 |
>> | Row2-Label2 | Row2-TextField2 |
>> | Row3-Button1 | Row3-Button2 |


>>> <ul>
>>>   <li>Label1 - UserName</li>
>>>   <li>Label2 - Password</li>
>>>   <li>TextField1 - (Input) UserName</li>
>>>   <li>TextField2 - (Input) Password</li>
>>>   <li>Button1 - CANCEL</li>
>>>   <li>Button1 - LOGIN</li>
>>> </ul>

<p align="center"><img src="SwingLoginForm/projectImages/basic%20idea.png" width="400"></p>
<h4 align="center">Basic UI idea of the Login Form</h4>
