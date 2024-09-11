from product.Notification import Notification

class PushNotification(Notification):
    def send_notification(self):
        print("Sending Push Notification")