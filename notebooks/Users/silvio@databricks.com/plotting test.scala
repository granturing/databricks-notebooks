// Databricks notebook source exported at Thu, 15 Sep 2016 19:27:12 UTC
val df = sc.parallelize(Seq((1, "Joe"), (2, "Bob"))).toDF("id", "name")
display(df)

// COMMAND ----------

display(df.collect)

// COMMAND ----------

df.toJSON.collect

// COMMAND ----------

