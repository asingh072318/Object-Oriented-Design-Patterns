from interfaces.Notification import Notification


class SmsNotification(Notification):
    def send_notification(self):
        print("Sending SMS notification")