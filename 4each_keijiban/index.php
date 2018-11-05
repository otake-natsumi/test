<!DOCTYPE html>
<html lang="ja">

<head>
	<meta charset="UTF-8">
	<title>4eachblog 掲示板</title>
	<link rel="stylesheet" type="text/css" href="style.css">
</head>

<body>

	<?php
	
	mb_internal_encoding("UTF8");
	$pdo=new PDO("mysql:dbname=lesson;host=localhost;","root","mysql");
	$stmt = $pdo->query("select * from 4each_keijiban");
	
	?>

	<div id="logo">
		<img src="4eachblog_logo.jpg">
	</div>
	


	<header>
		<div class="link">
			<ul>
				<li>トップ</li>
				<li>プロフィール</li>
				<li>4eachについて</li>
				<li>登録フォーム</li>
				<li>問い合わせ</li>
				<li>その他</li>
			</ul>
		</div>
	</header>
	
	<div id="maincontent">
	<main>
			<div class="left_box">
				<h1>プログラミングに役立つ掲示板</h1>

				<div class="form_box">
					<h3>入力フォーム</h3>

					<form method="POST" action="insert.php">
						<div class="form">
							<lavel>ハンドルネーム</lavel>
							<br>
							<input type="text" class="text" size="35" name="handlename">
						</div>

						<div class="form">
							<lavel>タイトル</lavel>
							<br>
							<input type="text" class="text" size="35" name="title">
						</div>

						<div class="form">
							<lavel>コメント</lavel>
							<br>
							<textarea rows="6" cols="60" name="comments"></textarea>
						</div>

						<div class="form">
							<input type="submit" class="button" value="投稿する" />
						</div>
					</form>
				</div>

				<?php
					while ($row = $stmt->fetch()) {
					
				echo "<div class= 'kiji'>";
				echo "<h3>".$row['title']."</h3>";
				echo "<div class= 'contents'>";
				echo $row['comments'];
				echo "<div class= 'handlename'>posted by ".$row['handlename']."</div>";
				echo "</div>";
				echo "</div>";
					}
				?>

			</div>

			<div class="right_box">
				<h4>人気の記事</h4>
				<p>PHPオススメ本</p>
				<p>PHP MyAdminの使い方</p>
				<p>今人気のエディタ</p>
				<p>HTMLの基礎</p>

				<h4>オススメリンク</h4>
				<p>インターノウス株式会社</p>
				<p>XAMPPダウンロード</p>
				<p>Eclipseダウンロード</p>
				<p>Bakcketsダウンロード</p>

				<h4>カテゴリ</h4>
				<p>HTML</p>
				<p>PHP</p>
				<p>MySQL</p>
				<p>Javascript</p>
			</div>
	</main>
	</div>
	

	<footer>
		cpyright internous | 4each blog is the one which provides A to Z about progamming
	</footer>

</body>

</html>
