/*
 * Copyright 2000-2017 JetBrains s.r.o.
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
package com.siyeh.ig.bugs;

import com.intellij.codeInspection.InspectionProfileEntry;
import com.intellij.testFramework.LightProjectDescriptor;
import com.siyeh.ig.LightInspectionTestCase;
import org.jetbrains.annotations.NotNull;

public class ForLoopThatDoesntUseLoopVariableInspectionTest extends LightInspectionTestCase {

  public void testForLoopThatDoesntUseLoopVariable() {
    doTest();
  }

  @Override
  protected InspectionProfileEntry getInspection() {
    return new ForLoopThatDoesntUseLoopVariableInspection();
  }

  @Override
  protected String getBasePath() {
    return "/plugins/InspectionGadgets/test/com/siyeh/igtest/bugs/for_does_not_use_var";
  }

  @NotNull
  @Override
  protected LightProjectDescriptor getProjectDescriptor() {
    return JAVA_8;
  }
}