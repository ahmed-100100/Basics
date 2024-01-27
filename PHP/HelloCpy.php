<?php
include("database.php");
/*Page Creation
echo"<br>Hello World!<br>";
echo"I'm Ahmed Hassan.";
$name = "ABO7MED";
$age = 18;
$gpa = 2.89;
$salary = 10000;
$student = True;
$online = False;
$d = $salary *2;
$p = $salary **2;
echo"<br>My nickname is {$name}.";
echo"<br>My age is {$age}.";
echo"<br>My GPA is {$gpa}.";
echo"<br>My salary is \${$salary}.";
echo"<br>Student = {$student}";
echo"<br>Online Status : {$online}";
echo"<br>I hope to double my salary so it can be \${$d}.";
echo"<br>But to raise it to the power two in order to be = \${$p}.<br>";
*/
#####################################################################################################
/*Arithmetic Operators
 (+ - * / ** %)
Increament/Decreament operators : ++ or --
shortcuts by x : +=x or -=x or etc...
*/
#####################################################################################################
/*GET
$x=null;
if (isset($_GET["secret_code"])){
    $x = $_GET["secret_code"];
}
echo $x ;
*/
#####################################################################################################
/*isset & empty
$test = true;
echo isset($test);
echo empty($test);*/
#####################################################################################################
/*Functions
function hyp($a , $b){
    $c = sqrt($a**2 + $b**2);
    return $c;
}
echo hyp(3,4);*/
#####################################################################################################
/*Password Hashing
$password = "HEY!";
$hash = password_hash($password , PASSWORD_DEFAULT);
if(password_verify("HEY!" , $hash)){
    echo "You're logged in!<br>";
}
else{echo "Incorrect password...<br>";}*/
#####################################################################################################
/*Data Entry
$username = "Ahmed"; 
$password = "heyhey";
$hash = password_hash($password , PASSWORD_DEFAULT);
$sql = "INSERT INTO users (user, password) VALUES ('$username', '$hash')";
try{
mysqli_query($conn, $sql); echo "User is now registered";
} catch(mysqli_sql_exception){ echo"Could not register user"; }
mysqli_close($conn);
*/
#####################################################################################################
/*Querying Data From MySQL Database To One Item
$sql = "SELECT * FROM users WHERE user = 'Ahmed'";
$result = mysqli_query($conn , $sql);
if(mysqli_num_rows($result) > 0){
    $row = mysqli_fetch_assoc($result);
    echo "<br>";
    echo "Username: {$row["user"]}<br>";
    echo "ID: {$row["id"]}<br>";
    echo "Registeration Date: {$row["reg_date"]}<br>";
    mysqli_close($conn);
}
else{echo"No User Is Found!";}
*/
#####################################################################################################
/*Querying Data From MySQL Database To Multiple Items
$sql = "SELECT * FROM users";
$result = mysqli_query($conn , $sql);
if(mysqli_num_rows($result) > 0){
    while($row = mysqli_fetch_assoc($result)){
    echo "<br>";
    echo "Username: {$row["user"]}<br>";
    echo "ID: {$row["id"]}<br>";
    echo "Registeration Date: {$row["reg_date"]}<br>";
    };
}
else{echo"No User Is Found!";}
mysqli_close($conn);
*/
#####################################################################################################


//---------------------------------------------------------" Project"---------------------------------------------------------
?>



<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="author" content="Ahmed Hassan">
        <meta name="description" content="Registration Form">
     <title>Registration</title>
    </head>
    <body>
       <form action="<?php htmlspecialchars($_SERVER["PHP_SELF"])?>" method="post">
            <h2>Welcome To FakeBook!</h2>
            Username:<br>
            <input type="text" name="username"><br>
            Password:<br>
            <input type="password" name="password"><br>
            <input type="submit" name="submit" value="register"><br>
       </form>
    </body>
</html>
<?php
if($_SERVER["REQUEST_METHOD"] == "POST"){
    $username = filter_input(INPUT_POST , "username" , FILTER_SANITIZE_SPECIAL_CHARS);
    $password = filter_input(INPUT_POST , "password" , FILTER_SANITIZE_SPECIAL_CHARS);
}
if(empty($username)){
    echo"Please Enter Your Username!";
}
elseif(empty($password)){
    echo"Please Enter Your Password!";
}
elseif(empty($username) && empty($password)){
    echo"Please Enter Your Username & Password!";
}
else{
    $hash = password_hash($password , PASSWORD_DEFAULT);
    $sql = "INSERT INTO users (user, password) VALUES ('$username', '$hash')";
    try{
    mysqli_query($conn , $sql);
    echo"You're now registered!";
    }
    catch(mysqli_sql_exception){
        echo"That username is taken...<br>Please try another one!";  
    }
}
mysqli_close($conn);
?>