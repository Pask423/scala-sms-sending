object Runner extends App {

  private val sendCorrectly: Boolean =
    Sender.send("Receiver phone number goes here", "Hello SMS world", "Scala SMS")
  println("Message has been send correctly: '%b'".format(sendCorrectly))
}
