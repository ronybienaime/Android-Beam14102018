package com.brett.beam.models;

import android.content.ContentValues;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.OperatorGroup;
import com.raizlabs.android.dbflow.sql.language.SQLite;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import com.raizlabs.android.dbflow.structure.ModelAdapter;
import com.raizlabs.android.dbflow.structure.database.DatabaseStatement;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import com.raizlabs.android.dbflow.structure.database.FlowCursor;
import java.lang.Class;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class Form_Table extends ModelAdapter<Form> {
  /**
   * Primary Key AutoIncrement */
  public static final Property<Long> id = new Property<Long>(Form.class, "id");

  public static final Property<Integer> type = new Property<Integer>(Form.class, "type");

  public static final Property<String> nom = new Property<String>(Form.class, "nom");

  public static final Property<String> prenom = new Property<String>(Form.class, "prenom");

  public static final Property<String> phone = new Property<String>(Form.class, "phone");

  public static final Property<String> email = new Property<String>(Form.class, "email");

  public static final Property<String> web = new Property<String>(Form.class, "web");

  public static final Property<String> compagnie = new Property<String>(Form.class, "compagnie");

  public static final IProperty[] ALL_COLUMN_PROPERTIES = new IProperty[]{id,type,nom,prenom,phone,email,web,compagnie};

  public Form_Table(DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<Form> getModelClass() {
    return Form.class;
  }

  @Override
  public final String getTableName() {
    return "`Form`";
  }

  @Override
  public final Form newInstance() {
    return new Form();
  }

  @Override
  public final Property getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch ((columnName)) {
      case "`id`":  {
        return id;
      }
      case "`type`":  {
        return type;
      }
      case "`nom`":  {
        return nom;
      }
      case "`prenom`":  {
        return prenom;
      }
      case "`phone`":  {
        return phone;
      }
      case "`email`":  {
        return email;
      }
      case "`web`":  {
        return web;
      }
      case "`compagnie`":  {
        return compagnie;
      }
      default: {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }

  @Override
  public final void updateAutoIncrement(Form model, Number id) {
    model.setId(id.longValue());
  }

  @Override
  public final Number getAutoIncrementingId(Form model) {
    return model.getId();
  }

  @Override
  public final String getAutoIncrementingColumnName() {
    return "id";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return ALL_COLUMN_PROPERTIES;
  }

  @Override
  public final void bindToInsertValues(ContentValues values, Form model) {
    values.put("`type`", model.getType());
    values.put("`nom`", model.getNom() != null ? model.getNom() : null);
    values.put("`prenom`", model.getPrenom() != null ? model.getPrenom() : null);
    values.put("`phone`", model.getPhone() != null ? model.getPhone() : null);
    values.put("`email`", model.getEmail() != null ? model.getEmail() : null);
    values.put("`web`", model.getWeb() != null ? model.getWeb() : null);
    values.put("`compagnie`", model.getCompagnie() != null ? model.getCompagnie() : null);
  }

  @Override
  public final void bindToContentValues(ContentValues values, Form model) {
    values.put("`id`", model.getId());
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, Form model, int start) {
    statement.bindLong(1 + start, model.getType());
    statement.bindStringOrNull(2 + start, model.getNom());
    statement.bindStringOrNull(3 + start, model.getPrenom());
    statement.bindStringOrNull(4 + start, model.getPhone());
    statement.bindStringOrNull(5 + start, model.getEmail());
    statement.bindStringOrNull(6 + start, model.getWeb());
    statement.bindStringOrNull(7 + start, model.getCompagnie());
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, Form model) {
    int start = 0;
    statement.bindLong(1 + start, model.getId());
    bindToInsertStatement(statement, model, 1);
  }

  @Override
  public final void bindToUpdateStatement(DatabaseStatement statement, Form model) {
    statement.bindLong(1, model.getId());
    statement.bindLong(2, model.getType());
    statement.bindStringOrNull(3, model.getNom());
    statement.bindStringOrNull(4, model.getPrenom());
    statement.bindStringOrNull(5, model.getPhone());
    statement.bindStringOrNull(6, model.getEmail());
    statement.bindStringOrNull(7, model.getWeb());
    statement.bindStringOrNull(8, model.getCompagnie());
    statement.bindLong(9, model.getId());
  }

  @Override
  public final void bindToDeleteStatement(DatabaseStatement statement, Form model) {
    statement.bindLong(1, model.getId());
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `Form`(`type`,`nom`,`prenom`,`phone`,`email`,`web`,`compagnie`) VALUES (?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `Form`(`id`,`type`,`nom`,`prenom`,`phone`,`email`,`web`,`compagnie`) VALUES (?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getUpdateStatementQuery() {
    return "UPDATE `Form` SET `id`=?,`type`=?,`nom`=?,`prenom`=?,`phone`=?,`email`=?,`web`=?,`compagnie`=? WHERE `id`=?";
  }

  @Override
  public final String getDeleteStatementQuery() {
    return "DELETE FROM `Form` WHERE `id`=?";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `Form`(`id` INTEGER PRIMARY KEY AUTOINCREMENT, `type` INTEGER, `nom` TEXT, `prenom` TEXT, `phone` TEXT, `email` TEXT, `web` TEXT, `compagnie` TEXT)";
  }

  @Override
  public final void loadFromCursor(FlowCursor cursor, Form model) {
    model.setId(cursor.getLongOrDefault("id"));
    model.setType(cursor.getIntOrDefault("type"));
    model.setNom(cursor.getStringOrDefault("nom"));
    model.setPrenom(cursor.getStringOrDefault("prenom"));
    model.setPhone(cursor.getStringOrDefault("phone"));
    model.setEmail(cursor.getStringOrDefault("email"));
    model.setWeb(cursor.getStringOrDefault("web"));
    model.setCompagnie(cursor.getStringOrDefault("compagnie"));
  }

  @Override
  public final boolean exists(Form model, DatabaseWrapper wrapper) {
    return model.getId() > 0
    && SQLite.selectCountOf()
    .from(Form.class)
    .where(getPrimaryConditionClause(model))
    .hasData(wrapper);
  }

  @Override
  public final OperatorGroup getPrimaryConditionClause(Form model) {
    OperatorGroup clause = OperatorGroup.clause();
    clause.and(id.eq(model.getId()));
    return clause;
  }
}
