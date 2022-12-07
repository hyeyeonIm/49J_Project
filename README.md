# Math Quiz Game Project
---
## Member
- Minse Ha
- Hyeyeon Im
- Changhyun Oh
- Mahir Labib
---
## 1. Github link: 
https://github.com/hyeyeonIm/49J_Project



## 2. Presentation:
The ppt file is on our  github repository

## 3. each class and method listed with a 1-2 sentence description
- (i) Abstract class Math_Quiz: It creates the quiz frame, helps out with the general questions and answers displayed and received respectively. It also generates two random values that are later used in the Quiz. 
- (ii) Abstract class TF_Quiz: It creates the quiz frame and the radio buttons used in the GUI. 
- (iii) Class Quiz: Prompts the user to input the sum of two values
- (iv) Class Quiz2: Prompts the user to input the subtraction of two values
- (v) Class Quiz3: Prompts the user to input the factorial of a number
- (vi) Class Quiz4: Prompts the user to input the first prime number between two ranges of numbers. 
- (vii) Class Quiz5: This is based on boolean values. The user is prompted to input either “True” or “False” to the question “You can call a static method importing its class, but without creating an object”.
- (viii) Class Quiz6: This is based on boolean values. The user is prompted to input either “True” or “False” to the question “ You can call a static method importing its class, and creating at least one instance of its object”.
- (ix) Class Quiz7: This is based on boolean values. The user is prompted to input either “True” or “False” to the question “The code will work → String height = 30”.
- (x) Class Quiz8:This is based on boolean values. The user is prompted to input either “True” or “False” to the question “In terms of time complexity, O(2^n)>O(n^2)”. 
- (xi) Class Player: Temporal storage to save each player’s information to create linked list
- (xii) Class Ranking: Writes the input in Class “input” to the txt file. g read the file, and assign each line to each Class Player instance, store every Player instance in Linked list, sort the Linked list by score value, store the instance values of a sorted linked list in a string array and add jtable on screen with the string array. 
- (xiii) Class Answer: It declares getter and setter to use the user input and answer from  Quiz1-quiz8. 
- (xiv) Class Input: It creates the user input frame through the Jframe, does exception handling, includes the start button to begin the game and writes the player information to a txt file. 

## 4. instruction on how to run your program
- Download all the file in repository
- Make sure to put every files in the same folder
- Make sure you have player.txt file
- Run the code in file input.java 



## 5. JDK version
JDK version : 18.0.2.1


## 6. Libraries

### Factorial.java
- java.util.Random
- java.util.ArrayList


### input.java
- java.awt.event.ActionEvent;
- java.awt.event.ActionListener;


- javax.swing.*;
- java.awt.*;


- java.io.BufferedWriter;
- java.io.FileWriter;
- java.io.IOException;
- java.io.PrintWriter;


### math_quiz.java
- java.awt.Color
- javax.swing.*
- java.awt.*
- java.util.Random

### Player.java
- java.util.Collections
- java.util.LinkedList
- java.util.List

### PrimeNumber.java
- import java.util.Scanner
- import java.util.Random
- import java.util.ArrayList

### Quiz..java
- import java.awt.event.ActionEvent
- java.awt.event.ActionListener
- javax.swing.*
- java.awt.*
- java.io.BufferedWriter
- java.io.FileWriter
- java.io.IOException
- java.io.PrintWriter
- java.util.ArrayList

### Ranking.java
- java.awt.event.ActionEvent;
- java.awt.event.ActionListener;
- javax.swing.*;
- java.awt.*;
- java.io.BufferedReader;
- java.io.FileReader;
- java.io.IOException;
- java.util.Collections;
- java.util.LinkedList;
- java.util.List;

### tf_quiz.java
- java.awt.*
- javax.swing.*

