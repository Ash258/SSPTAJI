<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <meta http-equiv="content-type" content="text/html; charset=windows-1250">
  <meta name="generator" content="PSPad editor, www.pspad.com">
  <title></title>
  </head>
  <body>
  <h1>
   Vypocet odporu
  </h1> 
  <?php     
  echo("<fieldset>\n"); 
  echo("<legend>Vyber pocet odporu</legend>\n");
  echo ("<form method='POST'>");
  $pocet=$_REQUEST['pocet'];                  
  $zapojeni=$_REQUEST['serpar'];

  echo ("Pocet odporu:&nbsp;&nbsp;<br/><input type='text' name='pocet' 
         value='$pocet'>");
  
  echo ("<input type='submit' name='odeslat'>");
  
  if(isset($_REQUEST['odeslat']))
  {     
    {
      for($i=1;$i<=$pocet;$i++)
      {
        $R[$i]=$_REQUEST["R$i"];
      }    
    }
      for($i=1;$i<=$pocet;$i++) 
      {                                                         
        echo ("<br/>R$i <input type='text' name='R$i' value='$R[$i]'>");       
      }
     
     if ($zapojeni=='par')
     {
     echo ("<br/><select name='serpar'>
     <option value='ser'>S�riov�</option>
     <option value='par' selected>Paraleln�</option></select>                
     <input type='submit' name='odeslat'></form>");
     }
     else
     {
     echo ("<br/><select name='serpar'>
     <option value='ser' selected>S�riov�</option>
     <option value='par'>Paraleln�</option></select>                
     <input type='submit' name='odeslat'></form>");
     }
     echo("</fieldset>\n"); 
    $empty = 0;
     for($i=1;$i<=count($R);$i++)
         if($R[$i] == '')
         {
             $empty = 1;
             break;
         }
     if(!$empty)
     {  
       if ($zapojeni=='ser')
         {
         for($i=0;$i<$pocet;$i++)
           {
             $vysledek += $R[$i+1];
           }
         echo("V�sledn� odpor s�riov�ho zapojen� je: $vysledek &Omega;");
         }
       else
         {
         for($i=0;$i<$pocet;$i++)
           {
             $vysledek += 1/$R[$i+1];
           }
           $vysledek = 1/$vysledek;
         echo("V�sledn� odpor paraleln�ho zapojen� je: $vysledek &Omega;");
         }
     }
   }
   ?>
  </body>
</html>
