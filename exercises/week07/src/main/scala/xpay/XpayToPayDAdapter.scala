package xpay

import scala.beans.{BeanProperty}


class XpayToPayDAdapter(private val xpay: Xpay) extends PayD {

  @BeanProperty
  var custCardNo: String = _

  @BeanProperty
  var cardOwnerName: String = _

  @BeanProperty
  var cardExpMonthDate: String = _

  private var CVVNo: java.lang.Integer = _

  @BeanProperty
  var totalAmount: java.lang.Double = _

  setProp()

  override def getCVVNo(): java.lang.Integer = cVVNo

  override def setCVVNo(cVVNo: java.lang.Integer): Unit = {
    this.cVVNo = CVVNo
  }

  private def setProp(): Unit = {
    this.cardOwnerName = this.xpay.getCustomerName
    this.custCardNo = this.xpay.getCreditCardNo
    this.cardExpMonthDate = this.xpay.getCardExpMonth + "/" + this.xpay.getCardExpYear
    this.cVVNo = this.xpay.getCardCVVNo.intValue()
    this.totalAmount = this.xpay.getAmount

  }

}
