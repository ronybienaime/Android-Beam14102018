package com.raizlabs.android.dbflow.config;

import com.brett.beam.database.MyDatabase;
import com.brett.beam.models.Form_Table;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class MyDatabaseMyDataBase_Database extends DatabaseDefinition {
  public MyDatabaseMyDataBase_Database(DatabaseHolder holder) {
    addModelAdapter(new Form_Table(this), holder);
  }

  @Override
  public final Class<?> getAssociatedDatabaseClassFile() {
    return MyDatabase.class;
  }

  @Override
  public final boolean isForeignKeysSupported() {
    return false;
  }

  @Override
  public final boolean isInMemory() {
    return false;
  }

  @Override
  public final boolean backupEnabled() {
    return false;
  }

  @Override
  public final boolean areConsistencyChecksEnabled() {
    return false;
  }

  @Override
  public final int getDatabaseVersion() {
    return 1;
  }

  @Override
  public final String getDatabaseName() {
    return "MyDataBase";
  }
}
