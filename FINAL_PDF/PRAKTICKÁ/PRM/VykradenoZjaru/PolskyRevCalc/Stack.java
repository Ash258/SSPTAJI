/*    */ package PolskyRevCalc;
/*    */ 
/*    */ public class Stack
/*    */ {
/*    */   private Element top;
/*    */   
/*    */   public Stack() {
/*  8 */     this.top = null;
/*    */   }
/*    */   
/*    */   public boolean isEmpty() {
/* 12 */     if (this.top == null) {
/* 13 */       return true;
/*    */     }
/* 15 */     return false;
/*    */   }
/*    */   
/*    */   public Element top()
/*    */   {
/* 20 */     return this.top;
/*    */   }
/*    */   
/*    */   public void push(Element e) {
/* 24 */     e.setNext(this.top);
/* 25 */     this.top = e;
/*    */   }
/*    */   
/*    */   public Element pop() {
/* 29 */     if (isEmpty()) {
/* 30 */       return null;
/*    */     }
/*    */     
/* 33 */     Element tmp = this.top;
/* 34 */     this.top = tmp.getNext();
/* 35 */     return tmp;
/*    */   }
/*    */ }


/* Location:              G:\DOWN\MersPrime.jar!\PolskyRevCalc\Stack.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */