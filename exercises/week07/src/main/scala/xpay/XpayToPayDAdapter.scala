package xpay


import scala.beans.BeanProperty

class XpayToPayDAdapter(private val xpay: Xpay) extends PayD {

  @BeanProperty
  var cardOwnerName: String = _

  @BeanProperty
  var custCardNo: String = _

  private var cVVNo: Integer = _

  @BeanProperty
  var totalAmount: Double = _

  @BeanProperty
  var cardExpMonthDate: String = _

  setProp()

  override def getCVVNo(): Integer = cVVNo

  override def setCVVNo(cVVNo: Integer): Unit = {
    this.cVVNo = cVVNo
  }

  private def setProp(): Unit = {
    this.cardOwnerName = this.xpay.getCustomerName
    this.custCardNo = this.xpay.getCreditCardNo
    this.cardExpMonthDate = this.xpay.getCardExpMonth + "/" + this.xpay.getCardExpYear
    this.cVVNo = this.xpay.getCardCVVNo.intValue()
    this.totalAmount = this.xpay.getAmount
  }

}

