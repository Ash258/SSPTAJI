/*    */ package Adresar;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Kontakt
/*    */   implements Serializable
/*    */ {
/*    */   private String jmeno;
/*    */   private String prijmeni;
/*    */   
/*    */   public Kontakt(String jmeno, String prijmeni)
/*    */   {
/* 19 */     this.jmeno = jmeno;
/* 20 */     this.prijmeni = prijmeni;
/*    */   }
/*    */   
/*    */   public String getJmeno() {
/* 24 */     return this.jmeno;
/*    */   }
/*    */   
/*    */   public void setJmeno(String jmeno) {
/* 28 */     this.jmeno = jmeno;
/*    */   }
/*    */   
/*    */   public String getPrijmeni() {
/* 32 */     return this.prijmeni;
/*    */   }
/*    */   
/*    */   public void setPrijmeni(String prijmeni) {
/* 36 */     this.prijmeni = prijmeni;
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 41 */     return "<html>" + this.jmeno + "<br />" + this.prijmeni + "</html>";
/*    */   }
/*    */ }


/* Location:              G:\DOWN\MersPrime.jar!\Adresar\Kontakt.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */