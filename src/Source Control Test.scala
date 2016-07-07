// Databricks notebook source exported at Thu, 7 Jul 2016 18:58:17 UTC
val i = sc.parallelize(1 to 100)

// COMMAND ----------

i.reduce(_ + _)