from concreteProducts.EmailNotification import EmailNotification
from concreteProducts.PushNotification import PushNotification
from concreteProducts.SmsNotification import SmsNotification


class NotificationFactory:
    def create_notification(self,channel):
        if channel is None or channel.strip() == "":
            return None
        channel = channel.lower()
        if channel == "email":
            return EmailNotification()
        elif channel == "sms":
            return SmsNotification()
        elif channel == "push":
            return PushNotification()
        else:
            raise ValueError(f"Unknown notification channel: {channel}")