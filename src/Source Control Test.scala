// Databricks notebook source exported at Tue, 21 Jun 2016 11:57:28 UTC
val i = sc.parallelize(1 to 100)

// COMMAND ----------

i.reduce(_ + _)