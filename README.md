# doper-graphql-java-gateway
doper graphql java api网关,供客户端或其BFF端访问

# ui-team 
![Who owns BFF](document/WhoOwnsBFF.png)
- 前端团队拥有并负责开发BFF，可以采用同一样的技术栈如小程序前端采用H5、javascript，BFF采用nodejs
- 前端团队专注用户界面与用户体验而无需等待业务逻辑实现团队提供的api
- 这样减少与业务逻辑实现团队沟通，在还没有业务逻辑api之前，前端团队自己可以在BFF完全MOCK数据来支持用户界面或用户体验的开发

# bi-team  
![Who owns BFF](document/WhoOwnsBFF2.png)
![Who owns BFF](document/WhoOwnsBFF1.png)
- owns api, 
- microservices 
- repositories
