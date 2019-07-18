package com.qying.design.flyweight;

public class Client {

    public static void main(String[] args) {
        WebSiteFactory factory =new WebSiteFactory();
        Website website = factory.getWebSiteCategory("新闻");
        website.use(new User("tom"));

        Website website1 = factory.getWebSiteCategory("博客");
        website1.use(new User("jack"));

        Website website2 = factory.getWebSiteCategory("博客");
        website2.use(new User("smith"));

        Website website3 = factory.getWebSiteCategory("博客");
        website2.use(new User("king"));

        System.out.println("网站的分类="+factory.getWebSiteCount());
    }
}
