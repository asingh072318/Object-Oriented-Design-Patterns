from ConcreteColleague.User import User
from ConcreteMediator.Chatgroup import Chatgroup


if __name__ == "__main__":
    group = Chatgroup("Test Group")

    user1 = User("Ankit", group)
    user2 = User("Taylor", group)
    user3 = User("Tanmoy", group)

    group.add(user1)
    group.add(user2)
    group.add(user3)

    user1.sendMessage("Hello from Ankit")