from Proxy.ProxyYoutubeService import ProxyYoutubeService


if __name__ == "__main__":

    proxyService = ProxyYoutubeService()

    popular_videos = proxyService.getPopularVideos()
    for video in popular_videos:
        print(video.getVideoDetails())

    print("\nFetching popular videos again:")
    popular_videos = proxyService.getPopularVideos()
    for video in popular_videos:
        print(video.getVideoDetails())


    print("\nFetching video with ID '1':")
    video = proxyService.getVideo("1")
    print(video.getVideoDetails())

    # Fetch the same video again (will return cached result)
    print("\nFetching video with ID '1' again:")
    video = proxyService.getVideo("1")
    print(video.getVideoDetails())