from product.Notification import Notification


class EmailNotification(Notification):
    def send_notification(self):
        print("Sending email notification")