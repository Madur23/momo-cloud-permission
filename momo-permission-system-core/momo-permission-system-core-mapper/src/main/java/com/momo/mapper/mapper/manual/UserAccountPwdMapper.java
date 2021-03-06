/**
 * Copyright (c) 2018-2019, Jie Li 李杰 (mqgnsds@163.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.momo.mapper.mapper.manual;

import com.momo.mapper.dataobject.UserAccountPwdDO;
import org.apache.ibatis.annotations.Param;


public interface UserAccountPwdMapper {


    UserAccountPwdDO sysUserAccountLogin(@Param("sysUserLoginName") String sysUserLoginName);

    UserAccountPwdDO sysUserAccountByUserId(@Param("userId") Long userId);

    int insertSelective(UserAccountPwdDO userAccountPwdDO);

    int updateByPrimaryKeySelective(UserAccountPwdDO userAccountPwdDO);
}
