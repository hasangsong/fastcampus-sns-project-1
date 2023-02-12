spring.jpa:
  database: postgresql
  hibernate.dialect: org.hibernate.dialect.PostgreSQLDialect
  hibernate.ddl-auto: update
  properties.hibernate.format_sql: true
  show-sql: true

spring.datasource:
  hikari.maxium-pool-size: 4
  #  url: jdbc:postgresql://ec2-54-87-179-4.compute-1.amazonaws.com/ddj9bnd86fjo1q
  #  username: utgdrvrfkfmzwh
  #  password: d754642d99148bfcab80cc3965b0078aa8fd807a37d5dcdf033fa4d9161f1bb0

  url: jdbc:postgresql://ec2-54-163-140-5.compute-1.amazonaws.com:5432/de3cestlqkekp0
  username: u7bjqnltofpp1p
  password: p240170e441a1aa72fee6bba192898a83e9c30edf1f7aeb94329e15e34bc3dc2c
  platform: postgres
  driver-class-name: org.postgresql.Driver

jwt:
  secret-key: fast_campus.sns-application-2022.secret_key
  # 30 days
  token.expired-time-ms: 2592000000

spring.redis.url: redis://:p16eb8136279b2629c931d539b89c2491e9ef83cd2d9bc777afec1b649cb9b10d@ec2-3-224-198-214.compute-1.amazonaws.com:12979
