dataSource {
  pooled = false
  driverClassName = "com.mysql.jdbc.Driver"
  username = "grails"
  password = "server"
}
hibernate {
  cache.use_second_level_cache=true
  cache.use_query_cache=true
  cache.provider_class='org.hibernate.cache.EhCacheProvider'
}

// environment specific settings
environments {
  development {
    dataSource {
      // one of 'create', 'create-drop', 'update'
      dbCreate = "update"
      url = "jdbc:mysql://localhost:3306/bookstore_dev?autoreconnect=true"
    }
  }
  test {
    dataSource {
      dbCreate = "update"
      url = "jdbc:hsqldb:mem:testDb"
    }
  }
  production {
    dataSoruce {
      dbCreate = "update"
      url = "jdbc:hsqldb:file:prodDb;shutdown=true"
    }
  }
}
