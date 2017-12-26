<!-- Created by: Jonyberry --><!DOCTYPE html>
<html lang="cz">
<head>
    <meta charset="UTF-8">
    <title>Resistence</title>
</head>

<body>
<h1>Vypocet odporu</h1>

    <form action="Result.php" method="post">
        <fieldset>
            <legend>Zadání hodnoty a výběr řazení</legend>
	        <?php
		        /**
		         * @author "Jan Bártl"
		         */
		        if(isset($_REQUEST['edit'])){
			        if($_POST['count'] > 5){
				        $count = 5;
			        } else{
				        $count = $_REQUEST['count'];
			        }
			        $start = 1;
			        while($start <= $count){
				        echo "Odpor 00$start " . '<input type="text" maxlength="2" name="resistances[]" placeholder="Zadejte hodnotu pro ' . $start . '. odpor">';
				        echo '<br />';
				        $start++;
			        }
		        }
	        ?>
	        <br />
            <legend>Zapojení odporu</legend>
	        Sériové <input name="shift" type="radio" value="0" checked />
            <br />
            Paralelní <input name="shift" type="radio" value="1" />
            <br /><br />
            <input type="submit" name="countRes" value="Pocitej">
        </fieldset>
    </form>
    </body>
    </html>





