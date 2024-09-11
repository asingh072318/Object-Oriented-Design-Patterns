from creator.NotificationFactory import NotificationFactory


factory = NotificationFactory()

smsNotification = factory.create_notification("sms")
smsNotification.send_notification()

emailNotification = factory.create_notification("email")
emailNotification.send_notification()

pushNotification = factory.create_notification("push")
pushNotification.send_notification()