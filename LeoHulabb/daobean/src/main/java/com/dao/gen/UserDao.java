package main.java.com.dao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "USER".
*/
public class UserDao extends AbstractDao<User, Long> {

    public static final String TABLENAME = "USER";

    /**
     * Properties of entity User.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property UserName = new Property(1, String.class, "UserName", false, "USER_NAME");
        public final static Property Card = new Property(2, String.class, "Card", false, "CARD");
        public final static Property ImageUrl = new Property(3, String.class, "ImageUrl", false, "IMAGE_URL");
        public final static Property Address = new Property(4, String.class, "address", false, "ADDRESS");
        public final static Property Mb = new Property(5, String.class, "Mb", false, "MB");
        public final static Property Token = new Property(6, String.class, "Token", false, "TOKEN");
        public final static Property UserId = new Property(7, String.class, "UserId", false, "USER_ID");
        public final static Property DEVICETYPE = new Property(8, String.class, "DEVICETYPE", false, "DEVICETYPE");
        public final static Property DEVICEID = new Property(9, String.class, "DEVICEID", false, "DEVICEID");
        public final static Property VERSION = new Property(10, String.class, "VERSION", false, "VERSION");
        public final static Property AVATAR = new Property(11, String.class, "AVATAR", false, "AVATAR");
    };


    public UserDao(DaoConfig config) {
        super(config);
    }
    
    public UserDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"USER\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"USER_NAME\" TEXT," + // 1: UserName
                "\"CARD\" TEXT," + // 2: Card
                "\"IMAGE_URL\" TEXT," + // 3: ImageUrl
                "\"ADDRESS\" TEXT," + // 4: address
                "\"MB\" TEXT," + // 5: Mb
                "\"TOKEN\" TEXT," + // 6: Token
                "\"USER_ID\" TEXT," + // 7: UserId
                "\"DEVICETYPE\" TEXT," + // 8: DEVICETYPE
                "\"DEVICEID\" TEXT," + // 9: DEVICEID
                "\"VERSION\" TEXT," + // 10: VERSION
                "\"AVATAR\" TEXT);"); // 11: AVATAR
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"USER\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, User entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String UserName = entity.getUserName();
        if (UserName != null) {
            stmt.bindString(2, UserName);
        }
 
        String Card = entity.getCard();
        if (Card != null) {
            stmt.bindString(3, Card);
        }
 
        String ImageUrl = entity.getImageUrl();
        if (ImageUrl != null) {
            stmt.bindString(4, ImageUrl);
        }
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(5, address);
        }
 
        String Mb = entity.getMb();
        if (Mb != null) {
            stmt.bindString(6, Mb);
        }
 
        String Token = entity.getToken();
        if (Token != null) {
            stmt.bindString(7, Token);
        }
 
        String UserId = entity.getUserId();
        if (UserId != null) {
            stmt.bindString(8, UserId);
        }
 
        String DEVICETYPE = entity.getDEVICETYPE();
        if (DEVICETYPE != null) {
            stmt.bindString(9, DEVICETYPE);
        }
 
        String DEVICEID = entity.getDEVICEID();
        if (DEVICEID != null) {
            stmt.bindString(10, DEVICEID);
        }
 
        String VERSION = entity.getVERSION();
        if (VERSION != null) {
            stmt.bindString(11, VERSION);
        }
 
        String AVATAR = entity.getAVATAR();
        if (AVATAR != null) {
            stmt.bindString(12, AVATAR);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public User readEntity(Cursor cursor, int offset) {
        User entity = new User( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // UserName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // Card
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // ImageUrl
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // address
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // Mb
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // Token
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // UserId
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // DEVICETYPE
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // DEVICEID
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // VERSION
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11) // AVATAR
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, User entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUserName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setCard(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setImageUrl(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setAddress(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setMb(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setToken(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setUserId(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setDEVICETYPE(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setDEVICEID(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setVERSION(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setAVATAR(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(User entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(User entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
