// Databricks notebook source exported at Wed, 27 Jul 2016 14:47:55 UTC
val i = sc.parallelize(1 to 100)

// COMMAND ----------

i.reduce(_ + _)

// COMMAND ----------

val df = sqlContext.createDataFrame(Seq((1, "Joe"), (2, "Bob"))).toDF("id", "name")
display(df)

// COMMAND ----------

