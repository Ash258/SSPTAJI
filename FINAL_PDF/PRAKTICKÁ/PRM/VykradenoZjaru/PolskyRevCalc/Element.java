/*    */ package PolskyRevCalc;
/*    */ 
/*    */ public class Element
/*    */ {
/*    */   private double value;
/*    */   private Element next;
/*    */   
/*    */   public Element(double value) {
/*  9 */     this.value = value;
/* 10 */     this.next = null;
/*    */   }
/*    */   
/*    */   public double getValue() {
/* 14 */     return this.value;
/*    */   }
/*    */   
/*    */   public void setValue(double value) {
/* 18 */     this.value = value;
/*    */   }
/*    */   
/*    */   public Element getNext() {
/* 22 */     return this.next;
/*    */   }
/*    */   
/*    */   public void setNext(Element next) {
/* 26 */     this.next = next;
/*    */   }
/*    */ }


/* Location:              G:\DOWN\MersPrime.jar!\PolskyRevCalc\Element.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */