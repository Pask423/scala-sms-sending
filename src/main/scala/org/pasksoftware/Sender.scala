package org.pasksoftware

import com.vonage.client.VonageClient
import com.vonage.client.sms.{MessageStatus, SmsClient, SmsSubmissionResponse}
import com.vonage.client.sms.messages.TextMessage

object Sender {

  private val client: SmsClient = VonageClient
    .builder()
    .apiKey("Api Key")
    .apiSecret("Api Secret")
    .build
    .getSmsClient

  def send(receiverNumber: String, message: String, senderName: String): Boolean = {
    val smsMessage: TextMessage = new TextMessage(senderName, receiverNumber, message)

    val response: SmsSubmissionResponse = client.submitMessage(smsMessage)

    val responseStatus = response.getMessages.get(0).getStatus
    if (MessageStatus.OK.equals(responseStatus)) true
    else false
  }

}
