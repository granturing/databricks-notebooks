// Databricks notebook source exported at Fri, 12 Aug 2016 15:47:33 UTC
val i = sc.parallelize(1 to 100)

// COMMAND ----------

i.reduce(_ + _)

// COMMAND ----------

val df = sqlContext.createDataFrame(Seq((1, "Joe"), (2, "Bob"))).toDF("id", "name")
display(df)

// COMMAND ----------

test