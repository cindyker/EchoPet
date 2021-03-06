/*
 * This file is part of EchoPet.
 *
 * EchoPet is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * EchoPet is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with EchoPet.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.dsh105.echopet.compat.api.entity.type.nms;

import org.bukkit.entity.Horse;

import com.dsh105.echopet.compat.api.entity.HorseArmour;
import com.dsh105.echopet.compat.api.entity.IEntityAgeablePet;

public interface IEntityHorsePet extends IEntityAgeablePet {

    public void setSaddled(boolean flag);

	public void setColor(Horse.Color color);

	public void setVariant(Horse.Variant variant);
	
	public void setStyle(Horse.Style style);

	public void setArmour(HorseArmour a);

    public void setChested(boolean flag);
}