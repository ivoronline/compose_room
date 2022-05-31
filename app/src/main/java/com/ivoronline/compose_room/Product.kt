package com.ivoronline.compose_room

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
class Product {

  //PROPERTIES
  @NonNull
  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name = "productId")
  var id: Int = 0

  @ColumnInfo(name = "productName")
  var productName: String = ""

  var quantity: Int = 0

  //CONSTRUCTORS
  constructor() {}

  constructor(id: Int, productname: String, quantity: Int) {
    this.productName = productname
    this.quantity = quantity
  }

  constructor(productname: String, quantity: Int) {
    this.productName = productname
    this.quantity = quantity
  }

}