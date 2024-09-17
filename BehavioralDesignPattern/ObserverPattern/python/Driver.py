from Observer.Observer import Observer
from Subject.NewsArticle import NewsArticle


if __name__ == "__main__":
    newsarticle = NewsArticle()
    
    o1 = Observer("Ankit")
    o2 = Observer("Taylor")
    o3 = Observer("Tanmoy")

    newsarticle.attach(o1)
    newsarticle.attach(o2)
    newsarticle.attach(o3)

    newsarticle.publishArticle("Welcome to Observer Pattern")