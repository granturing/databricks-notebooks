// Databricks notebook source exported at Fri, 29 Jul 2016 16:27:00 UTC
val i = sc.parallelize(1 to 100).toDF("id")
i.registerTempTable("mytable")

// COMMAND ----------

display(i)

// COMMAND ----------

// MAGIC %md ### This is a demo of markdown

// COMMAND ----------

// MAGIC %sql select * from mytable

// COMMAND ----------

// MAGIC %md # Patrick is cool

// COMMAND ----------

// MAGIC %md this is a test

// COMMAND ----------

