package scala_samples

class Box {
  var h: BigDecimal = 0;
  var w: BigDecimal = 0;

  def showInfo { 
    printf("height: %d, width: %d", this.h, this.w)
  } 
}