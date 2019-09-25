遇到的问题：  
  1.org.apache.ibatis.binding.BindingException: Invalid bound statement (not found):   org.framework.nicp.authority.biz.mapper.UpmsResourceMapper.getResourceListByUserId  
  这个问题是mapper映射文件无法加载及路径问题  
  原因：SpringBoot默认配置情况下，只有resources路径下的xml文件会被扫描  
  解决办法：  
    方法一：将mapper映射文件放在resources目录下，通常会在resources目录下建一个mapper目录，存放各种mapper的映射文件，并且在application.properties中              配置 Mapper映射文件的路径为：mybatis.mapper-locations=classpath:mapper/*.xml  
    方法二：mapper映射文件依旧放在java目录下,此时，需要在pom.xml文件中添加java路径下xml文件扫描配置：  
           <build>  
               <resources>  
                   <resource>  
                      <filtering>true</filtering>  
                      <directory>${basedir}/src/main/java</directory>  
                      <includes>  
                          <include>**/*.xml</include>  
                      </includes>  
                   </resource>  
                   <resource>  
                      <directory>${basedir}/src/main/java</directory>  
                      <excludes>  
                         <exclude>**/*.xml</exclude>  
                      </excludes>  
                    </resource>  
               </resources>  
          </build>  
          并且在application.properties中配置 Mapper映射文件的路径时要加上包名：  
          #mybatis.mapper-locations=classpath:包名/*.xml  
          mybatis.mapper-locations=classpath:org.xiao.dao/*.xml  
         

    
