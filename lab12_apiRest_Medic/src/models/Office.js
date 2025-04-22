import { DataTypes, INTEGER } from "sequelize";
import { sequelize } from "../database/database.js";


export const Office = sequelize.define('Office', {
    id: {
        type: DataTypes.INTEGER,
        primaryKey: true,
        autoIncrement: true
    },
    name: {
        type: DataTypes.STRING
    },
    done: {
        type: DataTypes.BOOLEAN,
        toDefaultValue: false
    }
}, {
    timestamps: false
}
)