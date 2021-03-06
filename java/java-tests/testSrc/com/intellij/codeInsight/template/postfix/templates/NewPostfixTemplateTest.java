/*
 * Copyright 2000-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.codeInsight.template.postfix.templates;

import org.jetbrains.annotations.NotNull;

public class NewPostfixTemplateTest extends PostfixTemplateTestCase {
  @NotNull
  @Override
  protected String getSuffix() { return "new"; }

  public void testNew01() { doTest(); }
  public void testNew02() { doTest(); }
  public void testNew03() { doTest(); }
  public void testNew04() { doTest(); }
  public void testNew05() { doTest(); }
  public void testNew06() { doTest(); }
  public void testNew07() { doTest(); }
  public void testNew08() { doTest(); }
  public void testNewOnAssignExpression() { doTest(); }
}
