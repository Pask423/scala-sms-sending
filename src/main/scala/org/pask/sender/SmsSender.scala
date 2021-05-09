package org.pask.sender

import org.pask.outcome.SmsSendOutcome

trait SmsSender {

  def send(receiverNumber: String, message: String, senderName: String): SmsSendOutcome
}
