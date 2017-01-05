/**
 * Copyright (C) 2014-2017 Philip Helger (www.helger.com)
 * philip[at]helger[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.poi.excel.style;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

/**
 * Test class for class {@link EExcelPattern}.
 *
 * @author Philip Helger
 */
@Deprecated
public final class EExcelPatternTest
{
  @Test
  public void testBasic ()
  {
    for (final EExcelPattern ePattern : EExcelPattern.values ())
    {
      assertNotNull (ePattern.getValue ());
      assertSame (ePattern, EExcelPattern.valueOf (ePattern.name ()));
    }
  }
}
