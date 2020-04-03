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
package com.momo.mapper.enums;

import com.alibaba.fastjson.JSONObject;

/**
 * @ClassName: Sex
 * @Author: Jie Li
 * @Date 2019-12-21 21:47
 * @Description: 性别 枚举
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2019</p>
 **/
public enum SexEnum {
    woman(0, "女", ""),
    man(1, "男", ""),
    secret(2, "保密", "");

    public final Integer type;
    public final String value;
    public final String description;

    SexEnum(Integer type, String value, String description) {
        this.type = type;
        this.value = value;
        this.description = description;
    }
}
