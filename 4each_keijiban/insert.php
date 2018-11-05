<?php

mb_internal_encoding("UTF8");
	
	$pdo=new PDO("mysql:dbname=lesson;host=localhost;" ,"root","mysql");
	$pdo->exec("insert into 4each_keijiban(handlename,title,comments) values('".$_POST['handlename']."','".$_POST['title']."','".$_POST['comments']."');");

header("Location:http://localhost/4each_keijiban/index.php");

?>

<!DOCTYPE html>
<html lang="ja">

<head>
	<meta charset="UTF-8">
	<title>4eachblog 掲示板</title>
	<link rel="stylesheet" type="text/css" href="style.css">
</head>
	
	
							
