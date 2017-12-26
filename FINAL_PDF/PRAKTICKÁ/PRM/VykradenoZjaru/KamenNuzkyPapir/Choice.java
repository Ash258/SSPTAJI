/*    */ package KamenNuzkyPapir;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class Choice
/*    */ {
/*    */   public String name;
/*    */   
/*    */ 
/*    */ 
/*    */   public String[] winAgainst;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public Choice(String name, String[] winAgainst)
/*    */   {
/* 20 */     this.name = name;
/* 21 */     this.winAgainst = winAgainst;
/*    */   }
/*    */   
/*    */   public boolean wins(String pc) {
/* 25 */     for (String choice : this.winAgainst) {
/* 26 */       if (choice.equals(pc)) return true;
/*    */     }
/* 28 */     return false;
/*    */   }
/*    */ }


/* Location:              G:\DOWN\MersPrime.jar!\KamenNuzkyPapir\Choice.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */