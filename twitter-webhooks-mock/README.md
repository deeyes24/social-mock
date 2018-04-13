# TwitterWebhooksMock

------------

Behaviour: 
  Purpose :
     This Dropwizard App can be used for testing Webhook End Points for Twitter Activity Api.
     
  The Application will start publishing below Webhook Events to the configured URL 
     a. Tweets
     b. UserMentions
     c. Direct Messages Send/Received
     d. Follow Events.
     e. Following Me Events
     f. Favorited Events
     g. Retweets
     h. Quoted Tweets
     i. Retweets of Quoted Retweets
     j. Reply
     

How to start the TwitterWebhooksMock application
---

1. Run `mvn clean install` to build your application
2. Start application with `java -jar target/twitter-webhooks-mock-1.0-SNAPSHOT.jar server config.yml`
3. To check that your application is running enter url `http://localhost:8080`


Health Check
---

To see your applications health enter url `http://localhost:8081/healthcheck`


Externl Links
     
     https://developer.twitter.com/en/products/accounts-and-users/account-activity-api.html  
      
     https://developer.twitter.com/en/docs/accounts-and-users/subscribe-account-activity/overview