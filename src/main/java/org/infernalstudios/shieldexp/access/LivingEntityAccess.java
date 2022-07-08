/**
 * Copyright 2022 Infernal Studios
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.infernalstudios.shieldexp.access;

public interface LivingEntityAccess {

	public int getParryCooldown();

	public void setParryCooldown(int parry);

	public int getBlockedCooldown();

	public void setBlockedCooldown(int block);

	public static LivingEntityAccess get(Object object) {
		return (LivingEntityAccess) object;
	}

}