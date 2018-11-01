/* This is auto-generated source by LL1-Parser-Gen.
 * Specification file: E:\program\java\decaf_PA1_B\src\decaf\frontend\Parser.spec
 * Options: unstrict mode
 * Generated at: Fri Nov 02 00:09:03 CST 2018
 * Please do NOT modify it!
 *
 * Project repository: https://github.com/paulzfm/LL1-Parser-Gen
 * Version: special version for decaf-PA1-B
 * Author: Zhu Fengmin (Paul)
 */

package decaf.frontend;

import decaf.Location;
import decaf.tree.Tree;
import decaf.tree.Tree.*;
import java.util.*;

public class Table
 {
    public static final int eof = -1;
    public static final int eos = 0;
    
    /* tokens and symbols */
    public static final int VOID = 257; //# line 13
    public static final int BOOL = 258; //# line 13
    public static final int INT = 259; //# line 13
    public static final int STRING = 260; //# line 13
    public static final int CLASS = 261; //# line 13
    public static final int NULL = 262; //# line 14
    public static final int EXTENDS = 263; //# line 14
    public static final int THIS = 264; //# line 14
    public static final int WHILE = 265; //# line 14
    public static final int FOR = 266; //# line 14
    public static final int IF = 267; //# line 15
    public static final int ELSE = 268; //# line 15
    public static final int RETURN = 269; //# line 15
    public static final int BREAK = 270; //# line 15
    public static final int NEW = 271; //# line 15
    public static final int PRINT = 272; //# line 16
    public static final int READ_INTEGER = 273; //# line 16
    public static final int READ_LINE = 274; //# line 16
    public static final int LITERAL = 275; //# line 17
    public static final int IDENTIFIER = 276; //# line 18
    public static final int AND = 277; //# line 18
    public static final int OR = 278; //# line 18
    public static final int STATIC = 279; //# line 18
    public static final int INSTANCEOF = 280; //# line 18
    public static final int LESS_EQUAL = 281; //# line 19
    public static final int GREATER_EQUAL = 282; //# line 19
    public static final int EQUAL = 283; //# line 19
    public static final int NOT_EQUAL = 284; //# line 19
    public static final int SCOPY = 285; //# line 21
    public static final int SEALED = 286; //# line 21
    public static final int GUARDED = 287; //# line 21
    public static final int NEWSAMEARRAY = 288; //# line 21
    public static final int JOINTARRAY = 289; //# line 21
    public static final int DEFAULT = 290; //# line 21
    public static final int IN = 291; //# line 21
    public static final int FOREACH = 292; //# line 21
    public static final int VAR = 293; //# line 21
    public static final int FORLEFT = 294; //# line 21
    public static final int FORRIGHT = 295; //# line 21
    
    public static final int VariableDef = 296;
    public static final int ExprT5 = 297;
    public static final int Oper8 = 298;
    public static final int BoundVariable = 299;
    public static final int Oper3 = 300;
    public static final int Oper6 = 301;
    public static final int Expr82 = 302;
    public static final int VariableList = 303;
    public static final int Formals = 304;
    public static final int Oper7 = 305;
    public static final int IfSubStmt = 306;
    public static final int Expr8 = 307;
    public static final int AfterSimpleTypeExpr = 308;
    public static final int Expr41 = 309;
    public static final int Expr2 = 310;
    public static final int Oper2 = 311;
    public static final int Expr6 = 312;
    public static final int IfBranchList = 313;
    public static final int BreakStmt = 314;
    public static final int ExprT2 = 315;
    public static final int StmtList = 316;
    public static final int Constant = 317;
    public static final int SubVariableList = 318;
    public static final int PrintStmt = 319;
    public static final int ConstantList = 320;
    public static final int ForStmt = 321;
    public static final int Expr9 = 322;
    public static final int Expr1 = 323;
    public static final int ForeachStmt = 324;
    public static final int ArrayConstant = 325;
    public static final int GuardedStmt = 326;
    public static final int Oper1 = 327;
    public static final int ElseClause = 328;
    public static final int ExprT41 = 329;
    public static final int FieldList = 330;
    public static final int SubExprList = 331;
    public static final int AfterParenExpr = 332;
    public static final int ClassDef = 333;
    public static final int ReturnStmt = 334;
    public static final int ExprList = 335;
    public static final int StmtBlock = 336;
    public static final int FunctionField = 337;
    public static final int AfterIdentExpr = 338;
    public static final int Oper9 = 339;
    public static final int Program = 340;
    public static final int Expr = 341;
    public static final int ExprT40 = 342;
    public static final int Type = 343;
    public static final int Expr5 = 344;
    public static final int AfterNewExpr = 345;
    public static final int Assignment = 346;
    public static final int ExtendsClause = 347;
    public static final int Oper5 = 348;
    public static final int Expr81 = 349;
    public static final int ArrayType = 350;
    public static final int Expr3 = 351;
    public static final int Actuals = 352;
    public static final int Variable = 353;
    public static final int ExprT3 = 354;
    public static final int Stmt = 355;
    public static final int SimpleStmt = 356;
    public static final int SimpleType = 357;
    public static final int WhileStmt = 358;
    public static final int ExprT1 = 359;
    public static final int Expr4 = 360;
    public static final int ExprT4 = 361;
    public static final int ReturnExpr = 362;
    public static final int IfList = 363;
    public static final int IfStmt = 364;
    public static final int ForExpr = 365;
    public static final int ForeachSubStmt = 366;
    public static final int ExprT6 = 367;
    public static final int ExprT8 = 368;
    public static final int Expr7 = 369;
    public static final int ConstantSubList = 370;
    public static final int Expr40 = 371;
    public static final int ClassList = 372;
    public static final int Oper4 = 373;
    public static final int Field = 374;
    
    /* start symbol */
    public final int start = Program;
    
    /**
      * Judge if a symbol (within valid range) is non-terminal.
      *
      * @param symbol the symbol to be judged.
      * @return true if and only if the symbol is non-terminal.
      */
        
    public boolean isNonTerminal(int symbol) {
        return symbol >= 296;
    }
    
    private final String[] allSymbols = {
        "VOID", "BOOL", "INT", "STRING", "CLASS",
        "NULL", "EXTENDS", "THIS", "WHILE", "FOR",
        "IF", "ELSE", "RETURN", "BREAK", "NEW",
        "PRINT", "READ_INTEGER", "READ_LINE", "LITERAL", "IDENTIFIER",
        "AND", "OR", "STATIC", "INSTANCEOF", "LESS_EQUAL",
        "GREATER_EQUAL", "EQUAL", "NOT_EQUAL", "SCOPY", "SEALED",
        "GUARDED", "NEWSAMEARRAY", "JOINTARRAY", "DEFAULT", "IN",
        "FOREACH", "VAR", "FORLEFT", "FORRIGHT", "VariableDef",
        "ExprT5", "Oper8", "BoundVariable", "Oper3", "Oper6",
        "Expr82", "VariableList", "Formals", "Oper7", "IfSubStmt",
        "Expr8", "AfterSimpleTypeExpr", "Expr41", "Expr2", "Oper2",
        "Expr6", "IfBranchList", "BreakStmt", "ExprT2", "StmtList",
        "Constant", "SubVariableList", "PrintStmt", "ConstantList", "ForStmt",
        "Expr9", "Expr1", "ForeachStmt", "ArrayConstant", "GuardedStmt",
        "Oper1", "ElseClause", "ExprT41", "FieldList", "SubExprList",
        "AfterParenExpr", "ClassDef", "ReturnStmt", "ExprList", "StmtBlock",
        "FunctionField", "AfterIdentExpr", "Oper9", "Program", "Expr",
        "ExprT40", "Type", "Expr5", "AfterNewExpr", "Assignment",
        "ExtendsClause", "Oper5", "Expr81", "ArrayType", "Expr3",
        "Actuals", "Variable", "ExprT3", "Stmt", "SimpleStmt",
        "SimpleType", "WhileStmt", "ExprT1", "Expr4", "ExprT4",
        "ReturnExpr", "IfList", "IfStmt", "ForExpr", "ForeachSubStmt",
        "ExprT6", "ExprT8", "Expr7", "ConstantSubList", "Expr40",
        "ClassList", "Oper4", "Field",
    };
    
    /**
      * Debugging function (pretty print).
      * Get string presentation of some token or symbol.
      *
      * @param symbol either terminal or non-terminal.
      * @return its string presentation.
      */
        
    public String name(int symbol) {
        if (symbol == eof) return "<eof>";
        if (symbol == eos) return "<eos>";
        if (symbol > 0 && symbol <= 256) return "'" + (char) symbol + "'";
        return allSymbols[symbol - 257];
    }
    
    /* begin lookahead symbols */
    private ArrayList<Set<Integer>> begin = new ArrayList<Set<Integer>>();
    private final Integer[][] beginRaw = {
        {VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('+'), Integer.valueOf('-'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, JOINTARRAY, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), NEWSAMEARRAY},
        {NEWSAMEARRAY},
        {VAR, VOID, CLASS, INT, STRING, BOOL},
        {EQUAL, NOT_EQUAL},
        {Integer.valueOf('*'), Integer.valueOf('/'), Integer.valueOf('%')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), JOINTARRAY, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), NEWSAMEARRAY, DEFAULT},
        {VOID, CLASS, INT, STRING, BOOL},
        {VOID, CLASS, INT, STRING, BOOL, Integer.valueOf(')')},
        {Integer.valueOf('-'), Integer.valueOf('!')},
        {Integer.valueOf('!'), FORLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {FORLEFT, READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf(']'), Integer.valueOf('!'), FORLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), FORLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), FORLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {AND},
        {Integer.valueOf('!'), FORLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {GUARDED, Integer.valueOf('}')},
        {BREAK},
        {AND, Integer.valueOf(']'), FOR, FORRIGHT, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, IF, Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FORLEFT, FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{'), Integer.valueOf('}')},
        {LITERAL, NULL, Integer.valueOf('[')},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {PRINT},
        {LITERAL, NULL, Integer.valueOf('['), Integer.valueOf(']')},
        {FOR},
        {LITERAL, NULL, Integer.valueOf('['), READ_INTEGER, READ_LINE, THIS, NEW, INSTANCEOF, Integer.valueOf('('), IDENTIFIER, FORLEFT},
        {Integer.valueOf('!'), FORLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {FOREACH},
        {Integer.valueOf('[')},
        {Integer.valueOf('{'), Integer.valueOf('(')},
        {OR},
        {ELSE, PRINT, VOID, FOR, Integer.valueOf('!'), FORLEFT, FOREACH, Integer.valueOf('-'), GUARDED, CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {NEWSAMEARRAY, Integer.valueOf(']'), FOR, FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, JOINTARRAY, AND, IF, Integer.valueOf(';')},
        {VOID, CLASS, INT, STRING, STATIC, BOOL, Integer.valueOf('}')},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {Integer.valueOf('!'), FORLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, CLASS},
        {CLASS, SEALED},
        {RETURN},
        {Integer.valueOf('!'), FORLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('{')},
        {Integer.valueOf('('), Integer.valueOf(';')},
        {Integer.valueOf('('), Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), JOINTARRAY, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), NEWSAMEARRAY},
        {JOINTARRAY},
        {CLASS, SEALED},
        {Integer.valueOf('!'), FORLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {JOINTARRAY, Integer.valueOf(']'), FOR, FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';')},
        {VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('!'), FORLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {IDENTIFIER, VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('='), Integer.valueOf(';'), Integer.valueOf(')')},
        {EXTENDS, Integer.valueOf('{')},
        {Integer.valueOf('+'), Integer.valueOf('-')},
        {Integer.valueOf(']'), Integer.valueOf(':')},
        {Integer.valueOf('['), IDENTIFIER},
        {Integer.valueOf('!'), FORLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), FORLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, Integer.valueOf(')')},
        {VOID, CLASS, INT, STRING, BOOL},
        {EQUAL, NOT_EQUAL, Integer.valueOf(']'), FOR, FORRIGHT, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';')},
        {VOID, CLASS, INT, STRING, BOOL, Integer.valueOf('!'), FORLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, VAR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), READ_INTEGER, IF, WHILE, FOR, RETURN, PRINT, BREAK, Integer.valueOf('{'), SCOPY, FOREACH},
        {Integer.valueOf('!'), FORLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, VAR, Integer.valueOf(';'), Integer.valueOf(')')},
        {INT, VOID, BOOL, STRING, CLASS},
        {WHILE},
        {OR, Integer.valueOf(']'), FOR, FORRIGHT, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), IF, Integer.valueOf(';')},
        {Integer.valueOf('!'), FORLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {LESS_EQUAL, GREATER_EQUAL, Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf(']'), FOR, FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, JOINTARRAY, AND, IF, Integer.valueOf(';'), NEWSAMEARRAY},
        {Integer.valueOf('!'), FORLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, Integer.valueOf(';')},
        {Integer.valueOf('!'), FORLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, Integer.valueOf('}')},
        {IF},
        {IF, FORRIGHT},
        {WHILE, Integer.valueOf(')')},
        {Integer.valueOf('*'), Integer.valueOf('/'), Integer.valueOf('%'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), JOINTARRAY, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), NEWSAMEARRAY},
        {Integer.valueOf('['), Integer.valueOf('.'), Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), JOINTARRAY, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%'), NEWSAMEARRAY},
        {Integer.valueOf('-'), Integer.valueOf('!'), FORLEFT, READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf(','), Integer.valueOf(']')},
        {Integer.valueOf('!'), FORLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {CLASS, SEALED, eof, eos},
        {LESS_EQUAL, GREATER_EQUAL, Integer.valueOf('<'), Integer.valueOf('>')},
        {STATIC, VOID, CLASS, INT, STRING, BOOL},
    };
    
    /**
      * Get begin lookahead tokens for `symbol`.
      *
      * @param symbol the non-terminal.
      * @return its begin lookahead tokens.
      */
        
    public Set<Integer> beginSet(int symbol) {
        return begin.get(symbol - 296);
    }
    
    /* follow set */
    private ArrayList<Set<Integer>> follow = new ArrayList<Set<Integer>>();
    private final Integer[][] followRaw = {
        {PRINT, VOID, FOR, Integer.valueOf('!'), FORLEFT, FOREACH, Integer.valueOf('-'), GUARDED, CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, JOINTARRAY, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), NEWSAMEARRAY},
        {Integer.valueOf('!'), FORLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {IN},
        {Integer.valueOf('!'), FORLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), FORLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), JOINTARRAY, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%'), NEWSAMEARRAY},
        {Integer.valueOf(')')},
        {Integer.valueOf(')')},
        {FORLEFT, READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {GUARDED, Integer.valueOf('}')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), JOINTARRAY, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%'), NEWSAMEARRAY},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), JOINTARRAY, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), NEWSAMEARRAY},
        {Integer.valueOf(']'), FOR, FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, JOINTARRAY, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf(']'), FOR, FORRIGHT, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, IF, Integer.valueOf(';')},
        {Integer.valueOf('!'), FORLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), JOINTARRAY, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), NEWSAMEARRAY},
        {Integer.valueOf('}')},
        {Integer.valueOf(';')},
        {Integer.valueOf(']'), FOR, FORRIGHT, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, IF, Integer.valueOf(';')},
        {Integer.valueOf('}')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), JOINTARRAY, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), NEWSAMEARRAY},
        {Integer.valueOf(')')},
        {Integer.valueOf(';')},
        {Integer.valueOf(']')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FORLEFT, FOREACH, Integer.valueOf('-'), GUARDED, CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), JOINTARRAY, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), NEWSAMEARRAY},
        {Integer.valueOf(']'), FOR, FORRIGHT, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), IF, Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FORLEFT, FOREACH, Integer.valueOf('-'), GUARDED, CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), JOINTARRAY, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), NEWSAMEARRAY},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FORLEFT, FOREACH, Integer.valueOf('-'), GUARDED, CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('!'), FORLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FORLEFT, FOREACH, Integer.valueOf('-'), GUARDED, CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(']'), FOR, FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, JOINTARRAY, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf('}')},
        {Integer.valueOf(')')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), JOINTARRAY, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), NEWSAMEARRAY},
        {CLASS, SEALED, eof, eos},
        {Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FORLEFT, FOREACH, Integer.valueOf('-'), GUARDED, CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, STATIC, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {VOID, CLASS, INT, Integer.valueOf('}'), STRING, STATIC, BOOL},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), JOINTARRAY, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), NEWSAMEARRAY},
        {Integer.valueOf('!'), FORLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {eof, eos},
        {Integer.valueOf(']'), FOR, FORRIGHT, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), IF, Integer.valueOf(';')},
        {Integer.valueOf(']'), FOR, FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';')},
        {IDENTIFIER},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, JOINTARRAY, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), NEWSAMEARRAY},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), JOINTARRAY, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), NEWSAMEARRAY},
        {Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('{')},
        {Integer.valueOf('!'), FORLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), JOINTARRAY, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%'), NEWSAMEARRAY},
        {IDENTIFIER},
        {Integer.valueOf(']'), FOR, FORRIGHT, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {Integer.valueOf(';'), Integer.valueOf(','), Integer.valueOf(')')},
        {Integer.valueOf(']'), FOR, FORRIGHT, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FORLEFT, FOREACH, Integer.valueOf('-'), GUARDED, CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('['), IDENTIFIER},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FORLEFT, FOREACH, Integer.valueOf('-'), GUARDED, CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(']'), FOR, FORRIGHT, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), IF, Integer.valueOf(';')},
        {Integer.valueOf(']'), FOR, FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, JOINTARRAY, AND, IF, Integer.valueOf(';'), NEWSAMEARRAY},
        {Integer.valueOf(']'), FOR, FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, JOINTARRAY, AND, IF, Integer.valueOf(';'), NEWSAMEARRAY},
        {Integer.valueOf(';')},
        {Integer.valueOf('}')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FORLEFT, FOREACH, Integer.valueOf('-'), GUARDED, CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), JOINTARRAY, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), NEWSAMEARRAY},
        {Integer.valueOf(')')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), JOINTARRAY, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), NEWSAMEARRAY},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), JOINTARRAY, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%'), NEWSAMEARRAY},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), JOINTARRAY, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%'), NEWSAMEARRAY},
        {Integer.valueOf(']')},
        {Integer.valueOf(']'), FOR, FORRIGHT, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, AND, IF, Integer.valueOf(';')},
        {eof, eos},
        {Integer.valueOf('!'), FORLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {VOID, CLASS, INT, Integer.valueOf('}'), STRING, STATIC, BOOL},
    };
    
    /**
      * Get follow set for `symbol`.
      *
      * @param symbol the non-terminal.
      * @return its follow set.
      */
        
    public Set<Integer> followSet(int symbol) {
        return follow.get(symbol - 296);
    }
    
    public Table() {
        for (int i = 0; i < 79; i++) {
            begin.add(new HashSet<>(Arrays.asList(beginRaw[i])));
            follow.add(new HashSet<>(Arrays.asList(followRaw[i])));
        }
    }
    
    /**
      * Predictive table `M` query function.
      * `query(A, a)` will return the corresponding term `M(A, a)`, i.e., the target production
      * for non-terminal `A` when the lookahead token is `a`.
      *
      * @param nonTerminal   the non-terminal.
      * @param lookahead     the lookahead symbol.
      * @return a pair `<id, right>` where `right` is the right-hand side of the target
      * production `nonTerminal -> right`, and `id` is the corresponding action id. To execute
      * such action, call `act(id, params)`.
      * If the corresponding term is undefined in the table, `null` will be returned.
      */
        
    public Map.Entry<Integer, List<Integer>> query(int nonTerminal, int lookahead) {
        switch (nonTerminal) {
            //# line 50
            case VariableDef: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(0, Arrays.asList(Variable, Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 595
            case ExprT5: {
                switch (lookahead) {
                    case '+':
                    case '-':
                        return new AbstractMap.SimpleEntry<>(1, Arrays.asList(Oper5, Expr6, ExprT5));
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case FORRIGHT:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case JOINTARRAY:
                    case AND:
                    case IF:
                    case ';':
                    case '<':
                    case '>':
                    case NEWSAMEARRAY:
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 389
            case Oper8: {
                switch (lookahead) {
                    case NEWSAMEARRAY:
                        return new AbstractMap.SimpleEntry<>(3, Arrays.asList(NEWSAMEARRAY));
                    default: return null;
                }
            }
            //# line 266
            case BoundVariable: {
                switch (lookahead) {
                    case VAR:
                        return new AbstractMap.SimpleEntry<>(4, Arrays.asList(VAR, IDENTIFIER));
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(5, Arrays.asList(Type, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 315
            case Oper3: {
                switch (lookahead) {
                    case EQUAL:
                        return new AbstractMap.SimpleEntry<>(6, Arrays.asList(EQUAL));
                    case NOT_EQUAL:
                        return new AbstractMap.SimpleEntry<>(7, Arrays.asList(NOT_EQUAL));
                    default: return null;
                }
            }
            //# line 361
            case Oper6: {
                switch (lookahead) {
                    case '*':
                        return new AbstractMap.SimpleEntry<>(8, Arrays.asList(Integer.valueOf('*')));
                    case '/':
                        return new AbstractMap.SimpleEntry<>(9, Arrays.asList(Integer.valueOf('/')));
                    case '%':
                        return new AbstractMap.SimpleEntry<>(10, Arrays.asList(Integer.valueOf('%')));
                    default: return null;
                }
            }
            //# line 722
            case Expr82: {
                switch (lookahead) {
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case '.':
                    case '-':
                    case FORRIGHT:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case '+':
                    case JOINTARRAY:
                    case AND:
                    case '*':
                    case IF:
                    case ';':
                    case '<':
                    case '[':
                    case '>':
                    case '%':
                    case NEWSAMEARRAY:
                        return new AbstractMap.SimpleEntry<>(11, Arrays.asList(ExprT8));
                    case DEFAULT:
                        return new AbstractMap.SimpleEntry<>(12, Arrays.asList(DEFAULT, Expr8));
                    default: return null;
                }
            }
            //# line 171
            case VariableList: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(13, Arrays.asList(Variable, SubVariableList));
                    default: return null;
                }
            }
            //# line 161
            case Formals: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(14, Arrays.asList(VariableList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(15, Arrays.asList());
                    default: return null;
                }
            }
            //# line 378
            case Oper7: {
                switch (lookahead) {
                    case '-':
                        return new AbstractMap.SimpleEntry<>(16, Arrays.asList(Integer.valueOf('-')));
                    case '!':
                        return new AbstractMap.SimpleEntry<>(17, Arrays.asList(Integer.valueOf('!')));
                    default: return null;
                }
            }
            //# line 992
            case IfSubStmt: {
                switch (lookahead) {
                    case '!':
                    case FORLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(18, Arrays.asList(Expr, Integer.valueOf(':'), Stmt));
                    default: return null;
                }
            }
            //# line 651
            case Expr8: {
                switch (lookahead) {
                    case FORLEFT:
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(19, Arrays.asList(Expr9, ExprT8));
                    default: return null;
                }
            }
            //# line 821
            case AfterSimpleTypeExpr: {
                switch (lookahead) {
                    case ']':
                        return new AbstractMap.SimpleEntry<>(20, Arrays.asList(Integer.valueOf(']'), Integer.valueOf('['), AfterSimpleTypeExpr));
                    case '!':
                    case FORLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(21, Arrays.asList(Expr, Integer.valueOf(']')));
                    default: return null;
                }
            }
            //# line 526
            case Expr41: {
                switch (lookahead) {
                    case '!':
                    case FORLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(22, Arrays.asList(Expr4, ExprT41));
                    default: return null;
                }
            }
            //# line 438
            case Expr2: {
                switch (lookahead) {
                    case '!':
                    case FORLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(23, Arrays.asList(Expr3, ExprT2));
                    default: return null;
                }
            }
            //# line 308
            case Oper2: {
                switch (lookahead) {
                    case AND:
                        return new AbstractMap.SimpleEntry<>(24, Arrays.asList(AND));
                    default: return null;
                }
            }
            //# line 612
            case Expr6: {
                switch (lookahead) {
                    case '!':
                    case FORLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(25, Arrays.asList(Expr7, ExprT6));
                    default: return null;
                }
            }
            //# line 982
            case IfBranchList: {
                switch (lookahead) {
                    case GUARDED:
                        return new AbstractMap.SimpleEntry<>(26, Arrays.asList(GUARDED, IfSubStmt, IfBranchList));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 934
            case BreakStmt: {
                switch (lookahead) {
                    case BREAK:
                        return new AbstractMap.SimpleEntry<>(28, Arrays.asList(BREAK));
                    default: return null;
                }
            }
            //# line 450
            case ExprT2: {
                switch (lookahead) {
                    case AND:
                        return new AbstractMap.SimpleEntry<>(29, Arrays.asList(Oper2, Expr3, ExprT2));
                    case ']':
                    case FOR:
                    case FORRIGHT:
                    case ':':
                    case ')':
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 198
            case StmtList: {
                switch (lookahead) {
                    case PRINT:
                    case VOID:
                    case FOR:
                    case '!':
                    case FORLEFT:
                    case FOREACH:
                    case '-':
                    case CLASS:
                    case READ_LINE:
                    case WHILE:
                    case RETURN:
                    case NULL:
                    case INT:
                    case SCOPY:
                    case IDENTIFIER:
                    case NEW:
                    case IF:
                    case VAR:
                    case THIS:
                    case INSTANCEOF:
                    case STRING:
                    case LITERAL:
                    case '(':
                    case ';':
                    case '[':
                    case BOOL:
                    case BREAK:
                    case READ_INTEGER:
                    case '{':
                        return new AbstractMap.SimpleEntry<>(31, Arrays.asList(Stmt, StmtList));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 845
            case Constant: {
                switch (lookahead) {
                    case LITERAL:
                        return new AbstractMap.SimpleEntry<>(33, Arrays.asList(LITERAL));
                    case NULL:
                        return new AbstractMap.SimpleEntry<>(34, Arrays.asList(NULL));
                    case '[':
                        return new AbstractMap.SimpleEntry<>(35, Arrays.asList(ArrayConstant));
                    default: return null;
                }
            }
            //# line 181
            case SubVariableList: {
                switch (lookahead) {
                    case ',':
                        return new AbstractMap.SimpleEntry<>(36, Arrays.asList(Integer.valueOf(','), Variable, SubVariableList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 962
            case PrintStmt: {
                switch (lookahead) {
                    case PRINT:
                        return new AbstractMap.SimpleEntry<>(38, Arrays.asList(PRINT, Integer.valueOf('('), ExprList, Integer.valueOf(')')));
                    default: return null;
                }
            }
            //# line 864
            case ConstantList: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                    case '[':
                        return new AbstractMap.SimpleEntry<>(39, Arrays.asList(Constant, ConstantSubList));
                    case ']':
                        return new AbstractMap.SimpleEntry<>(40, Arrays.asList());
                    default: return null;
                }
            }
            //# line 928
            case ForStmt: {
                switch (lookahead) {
                    case FOR:
                        return new AbstractMap.SimpleEntry<>(41, Arrays.asList(FOR, Integer.valueOf('('), SimpleStmt, Integer.valueOf(';'), Expr, Integer.valueOf(';'), SimpleStmt, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 741
            case Expr9: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                    case '[':
                        return new AbstractMap.SimpleEntry<>(42, Arrays.asList(Constant));
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(43, Arrays.asList(READ_INTEGER, Integer.valueOf('('), Integer.valueOf(')')));
                    case READ_LINE:
                        return new AbstractMap.SimpleEntry<>(44, Arrays.asList(READ_LINE, Integer.valueOf('('), Integer.valueOf(')')));
                    case THIS:
                        return new AbstractMap.SimpleEntry<>(45, Arrays.asList(THIS));
                    case NEW:
                        return new AbstractMap.SimpleEntry<>(46, Arrays.asList(NEW, AfterNewExpr));
                    case INSTANCEOF:
                        return new AbstractMap.SimpleEntry<>(47, Arrays.asList(INSTANCEOF, Integer.valueOf('('), Expr, Integer.valueOf(','), IDENTIFIER, Integer.valueOf(')')));
                    case '(':
                        return new AbstractMap.SimpleEntry<>(48, Arrays.asList(Integer.valueOf('('), AfterParenExpr));
                    case IDENTIFIER:
                        return new AbstractMap.SimpleEntry<>(49, Arrays.asList(IDENTIFIER, AfterIdentExpr));
                    case FORLEFT:
                        return new AbstractMap.SimpleEntry<>(50, Arrays.asList(FORLEFT, Expr, FOR, IDENTIFIER, IN, Expr, ForExpr));
                    default: return null;
                }
            }
            //# line 409
            case Expr1: {
                switch (lookahead) {
                    case '!':
                    case FORLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(51, Arrays.asList(Expr2, ExprT1));
                    default: return null;
                }
            }
            //# line 255
            case ForeachStmt: {
                switch (lookahead) {
                    case FOREACH:
                        return new AbstractMap.SimpleEntry<>(52, Arrays.asList(FOREACH, Integer.valueOf('('), BoundVariable, IN, Expr, ForeachSubStmt, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 858
            case ArrayConstant: {
                switch (lookahead) {
                    case '[':
                        return new AbstractMap.SimpleEntry<>(53, Arrays.asList(Integer.valueOf('['), ConstantList, Integer.valueOf(']')));
                    default: return null;
                }
            }
            //# line 798
            case GuardedStmt: {
                switch (lookahead) {
                    case '{':
                        return new AbstractMap.SimpleEntry<>(54, Arrays.asList(Integer.valueOf('{'), IfList, Integer.valueOf('}')));
                    case '(':
                        return new AbstractMap.SimpleEntry<>(55, Arrays.asList(Integer.valueOf('('), Expr, Integer.valueOf(')'), Stmt, ElseClause));
                    default: return null;
                }
            }
            //# line 301
            case Oper1: {
                switch (lookahead) {
                    case OR:
                        return new AbstractMap.SimpleEntry<>(56, Arrays.asList(OR));
                    default: return null;
                }
            }
            //# line 942
            case ElseClause: {
                switch (lookahead) {
                    case ELSE:
                        return new AbstractMap.SimpleEntry<>(57, Arrays.asList(ELSE, Stmt));
                    case PRINT:
                    case VOID:
                    case FOR:
                    case '!':
                    case FORLEFT:
                    case FOREACH:
                    case '-':
                    case GUARDED:
                    case CLASS:
                    case READ_LINE:
                    case WHILE:
                    case RETURN:
                    case NULL:
                    case INT:
                    case SCOPY:
                    case '}':
                    case IDENTIFIER:
                    case NEW:
                    case IF:
                    case VAR:
                    case THIS:
                    case INSTANCEOF:
                    case STRING:
                    case LITERAL:
                    case '(':
                    case ';':
                    case '[':
                    case BOOL:
                    case BREAK:
                    case READ_INTEGER:
                    case '{':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 538
            case ExprT41: {
                switch (lookahead) {
                    case NEWSAMEARRAY:
                        return new AbstractMap.SimpleEntry<>(59, Arrays.asList(Oper8, Expr4, ExprT41));
                    case ']':
                    case FOR:
                    case FORRIGHT:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case JOINTARRAY:
                    case AND:
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 121
            case FieldList: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case STATIC:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(61, Arrays.asList(Field, FieldList));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(62, Arrays.asList());
                    default: return null;
                }
            }
            //# line 906
            case SubExprList: {
                switch (lookahead) {
                    case ',':
                        return new AbstractMap.SimpleEntry<>(63, Arrays.asList(Integer.valueOf(','), Expr, SubExprList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(64, Arrays.asList());
                    default: return null;
                }
            }
            //# line 833
            case AfterParenExpr: {
                switch (lookahead) {
                    case '!':
                    case FORLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(65, Arrays.asList(Expr, Integer.valueOf(')')));
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(66, Arrays.asList(CLASS, IDENTIFIER, Integer.valueOf(')'), Expr9));
                    default: return null;
                }
            }
            //# line 103
            case ClassDef: {
                switch (lookahead) {
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(67, Arrays.asList(CLASS, IDENTIFIER, ExtendsClause, Integer.valueOf('{'), FieldList, Integer.valueOf('}')));
                    case SEALED:
                        return new AbstractMap.SimpleEntry<>(68, Arrays.asList(SEALED, CLASS, IDENTIFIER, ExtendsClause, Integer.valueOf('{'), FieldList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 949
            case ReturnStmt: {
                switch (lookahead) {
                    case RETURN:
                        return new AbstractMap.SimpleEntry<>(69, Arrays.asList(RETURN, ReturnExpr));
                    default: return null;
                }
            }
            //# line 898
            case ExprList: {
                switch (lookahead) {
                    case '!':
                    case FORLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(70, Arrays.asList(Expr, SubExprList));
                    default: return null;
                }
            }
            //# line 192
            case StmtBlock: {
                switch (lookahead) {
                    case '{':
                        return new AbstractMap.SimpleEntry<>(71, Arrays.asList(Integer.valueOf('{'), StmtList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 153
            case FunctionField: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(72, Arrays.asList(Integer.valueOf('('), Formals, Integer.valueOf(')'), StmtBlock));
                    case ';':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList(Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 734
            case AfterIdentExpr: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(74, Arrays.asList(Integer.valueOf('('), Actuals, Integer.valueOf(')')));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case '.':
                    case '-':
                    case FORRIGHT:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case '+':
                    case JOINTARRAY:
                    case AND:
                    case '*':
                    case IF:
                    case ';':
                    case '<':
                    case '[':
                    case '>':
                    case '%':
                    case NEWSAMEARRAY:
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 395
            case Oper9: {
                switch (lookahead) {
                    case JOINTARRAY:
                        return new AbstractMap.SimpleEntry<>(76, Arrays.asList(JOINTARRAY));
                    default: return null;
                }
            }
            //# line 28
            case Program: {
                switch (lookahead) {
                    case CLASS:
                    case SEALED:
                        return new AbstractMap.SimpleEntry<>(77, Arrays.asList(ClassDef, ClassList));
                    default: return null;
                }
            }
            //# line 403
            case Expr: {
                switch (lookahead) {
                    case '!':
                    case FORLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(78, Arrays.asList(Expr1));
                    default: return null;
                }
            }
            //# line 510
            case ExprT40: {
                switch (lookahead) {
                    case JOINTARRAY:
                        return new AbstractMap.SimpleEntry<>(79, Arrays.asList(Oper9, Expr41, ExprT40));
                    case ']':
                    case FOR:
                    case FORRIGHT:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case AND:
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 84
            case Type: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(81, Arrays.asList(SimpleType, ArrayType));
                    default: return null;
                }
            }
            //# line 583
            case Expr5: {
                switch (lookahead) {
                    case '!':
                    case FORLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(82, Arrays.asList(Expr6, ExprT5));
                    default: return null;
                }
            }
            //# line 807
            case AfterNewExpr: {
                switch (lookahead) {
                    case IDENTIFIER:
                        return new AbstractMap.SimpleEntry<>(83, Arrays.asList(IDENTIFIER, Integer.valueOf('('), Integer.valueOf(')')));
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(84, Arrays.asList(SimpleType, Integer.valueOf('['), AfterSimpleTypeExpr));
                    default: return null;
                }
            }
            //# line 292
            case Assignment: {
                switch (lookahead) {
                    case '=':
                        return new AbstractMap.SimpleEntry<>(85, Arrays.asList(Integer.valueOf('='), Expr));
                    case ';':
                    case ')':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 114
            case ExtendsClause: {
                switch (lookahead) {
                    case EXTENDS:
                        return new AbstractMap.SimpleEntry<>(87, Arrays.asList(EXTENDS, IDENTIFIER));
                    case '{':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 349
            case Oper5: {
                switch (lookahead) {
                    case '+':
                        return new AbstractMap.SimpleEntry<>(89, Arrays.asList(Integer.valueOf('+')));
                    case '-':
                        return new AbstractMap.SimpleEntry<>(90, Arrays.asList(Integer.valueOf('-')));
                    default: return null;
                }
            }
            //# line 707
            case Expr81: {
                switch (lookahead) {
                    case ']':
                        return new AbstractMap.SimpleEntry<>(91, Arrays.asList(Integer.valueOf(']'), Expr82));
                    case ':':
                        return new AbstractMap.SimpleEntry<>(92, Arrays.asList(Integer.valueOf(':'), Expr, Integer.valueOf(']'), ExprT8));
                    default: return null;
                }
            }
            //# line 93
            case ArrayType: {
                switch (lookahead) {
                    case '[':
                        return new AbstractMap.SimpleEntry<>(93, Arrays.asList(Integer.valueOf('['), Integer.valueOf(']'), ArrayType));
                    case IDENTIFIER:
                        return new AbstractMap.SimpleEntry<>(94, Arrays.asList());
                    default: return null;
                }
            }
            //# line 467
            case Expr3: {
                switch (lookahead) {
                    case '!':
                    case FORLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(95, Arrays.asList(Expr40, ExprT3));
                    default: return null;
                }
            }
            //# line 888
            case Actuals: {
                switch (lookahead) {
                    case '!':
                    case FORLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(96, Arrays.asList(ExprList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(97, Arrays.asList());
                    default: return null;
                }
            }
            //# line 56
            case Variable: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(98, Arrays.asList(Type, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 479
            case ExprT3: {
                switch (lookahead) {
                    case EQUAL:
                    case NOT_EQUAL:
                        return new AbstractMap.SimpleEntry<>(99, Arrays.asList(Oper3, Expr40, ExprT3));
                    case ']':
                    case FOR:
                    case FORRIGHT:
                    case ':':
                    case ')':
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case AND:
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 206
            case Stmt: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(101, Arrays.asList(VariableDef));
                    case '!':
                    case FORLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case VAR:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case ';':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(102, Arrays.asList(SimpleStmt, Integer.valueOf(';')));
                    case IF:
                        return new AbstractMap.SimpleEntry<>(103, Arrays.asList(IfStmt));
                    case WHILE:
                        return new AbstractMap.SimpleEntry<>(104, Arrays.asList(WhileStmt));
                    case FOR:
                        return new AbstractMap.SimpleEntry<>(105, Arrays.asList(ForStmt));
                    case RETURN:
                        return new AbstractMap.SimpleEntry<>(106, Arrays.asList(ReturnStmt, Integer.valueOf(';')));
                    case PRINT:
                        return new AbstractMap.SimpleEntry<>(107, Arrays.asList(PrintStmt, Integer.valueOf(';')));
                    case BREAK:
                        return new AbstractMap.SimpleEntry<>(108, Arrays.asList(BreakStmt, Integer.valueOf(';')));
                    case '{':
                        return new AbstractMap.SimpleEntry<>(109, Arrays.asList(StmtBlock));
                    case SCOPY:
                        return new AbstractMap.SimpleEntry<>(110, Arrays.asList(SCOPY, Integer.valueOf('('), IDENTIFIER, Integer.valueOf(','), Expr, Integer.valueOf(')')));
                    case FOREACH:
                        return new AbstractMap.SimpleEntry<>(111, Arrays.asList(ForeachStmt));
                    default: return null;
                }
            }
            //# line 277
            case SimpleStmt: {
                switch (lookahead) {
                    case '!':
                    case FORLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(112, Arrays.asList(Expr, Assignment));
                    case VAR:
                        return new AbstractMap.SimpleEntry<>(113, Arrays.asList(VAR, IDENTIFIER, Integer.valueOf('='), Expr));
                    case ';':
                    case ')':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 62
            case SimpleType: {
                switch (lookahead) {
                    case INT:
                        return new AbstractMap.SimpleEntry<>(115, Arrays.asList(INT));
                    case VOID:
                        return new AbstractMap.SimpleEntry<>(116, Arrays.asList(VOID));
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(117, Arrays.asList(BOOL));
                    case STRING:
                        return new AbstractMap.SimpleEntry<>(118, Arrays.asList(STRING));
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(119, Arrays.asList(CLASS, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 922
            case WhileStmt: {
                switch (lookahead) {
                    case WHILE:
                        return new AbstractMap.SimpleEntry<>(120, Arrays.asList(WHILE, Integer.valueOf('('), Expr, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 421
            case ExprT1: {
                switch (lookahead) {
                    case OR:
                        return new AbstractMap.SimpleEntry<>(121, Arrays.asList(Oper1, Expr2, ExprT1));
                    case ']':
                    case FOR:
                    case FORRIGHT:
                    case ':':
                    case ')':
                    case ',':
                    case WHILE:
                    case '=':
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 554
            case Expr4: {
                switch (lookahead) {
                    case '!':
                    case FORLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(123, Arrays.asList(Expr5, ExprT4));
                    default: return null;
                }
            }
            //# line 566
            case ExprT4: {
                switch (lookahead) {
                    case LESS_EQUAL:
                    case GREATER_EQUAL:
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(124, Arrays.asList(Oper4, Expr5, ExprT4));
                    case ']':
                    case FOR:
                    case FORRIGHT:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case JOINTARRAY:
                    case AND:
                    case IF:
                    case ';':
                    case NEWSAMEARRAY:
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 955
            case ReturnExpr: {
                switch (lookahead) {
                    case '!':
                    case FORLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(126, Arrays.asList(Expr));
                    case ';':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 968
            case IfList: {
                switch (lookahead) {
                    case '!':
                    case FORLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(128, Arrays.asList(IfSubStmt, IfBranchList));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(129, Arrays.asList());
                    default: return null;
                }
            }
            //# line 792
            case IfStmt: {
                switch (lookahead) {
                    case IF:
                        return new AbstractMap.SimpleEntry<>(130, Arrays.asList(IF, GuardedStmt));
                    default: return null;
                }
            }
            //# line 786
            case ForExpr: {
                switch (lookahead) {
                    case IF:
                        return new AbstractMap.SimpleEntry<>(131, Arrays.asList(IF, Expr, FORRIGHT));
                    case FORRIGHT:
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList(FORRIGHT));
                    default: return null;
                }
            }
            //# line 260
            case ForeachSubStmt: {
                switch (lookahead) {
                    case WHILE:
                        return new AbstractMap.SimpleEntry<>(133, Arrays.asList(WHILE, Expr));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 624
            case ExprT6: {
                switch (lookahead) {
                    case '*':
                    case '/':
                    case '%':
                        return new AbstractMap.SimpleEntry<>(135, Arrays.asList(Oper6, Expr7, ExprT6));
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case '-':
                    case FORRIGHT:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case '+':
                    case JOINTARRAY:
                    case AND:
                    case IF:
                    case ';':
                    case '<':
                    case '>':
                    case NEWSAMEARRAY:
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 681
            case ExprT8: {
                switch (lookahead) {
                    case '[':
                        return new AbstractMap.SimpleEntry<>(137, Arrays.asList(Integer.valueOf('['), Expr, Expr81));
                    case '.':
                        return new AbstractMap.SimpleEntry<>(138, Arrays.asList(Integer.valueOf('.'), IDENTIFIER, AfterIdentExpr, ExprT8));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case '-':
                    case FORRIGHT:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case '+':
                    case JOINTARRAY:
                    case AND:
                    case '*':
                    case IF:
                    case ';':
                    case '<':
                    case '>':
                    case '%':
                    case NEWSAMEARRAY:
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 641
            case Expr7: {
                switch (lookahead) {
                    case '-':
                    case '!':
                        return new AbstractMap.SimpleEntry<>(140, Arrays.asList(Oper7, Expr8));
                    case FORLEFT:
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(141, Arrays.asList(Expr8));
                    default: return null;
                }
            }
            //# line 877
            case ConstantSubList: {
                switch (lookahead) {
                    case ',':
                        return new AbstractMap.SimpleEntry<>(142, Arrays.asList(Integer.valueOf(','), Constant, ConstantSubList));
                    case ']':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 495
            case Expr40: {
                switch (lookahead) {
                    case '!':
                    case FORLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(144, Arrays.asList(Expr41, ExprT40));
                    default: return null;
                }
            }
            //# line 39
            case ClassList: {
                switch (lookahead) {
                    case CLASS:
                    case SEALED:
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList(ClassDef, ClassList));
                    case eof:
                    case eos:
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 327
            case Oper4: {
                switch (lookahead) {
                    case LESS_EQUAL:
                        return new AbstractMap.SimpleEntry<>(147, Arrays.asList(LESS_EQUAL));
                    case GREATER_EQUAL:
                        return new AbstractMap.SimpleEntry<>(148, Arrays.asList(GREATER_EQUAL));
                    case '<':
                        return new AbstractMap.SimpleEntry<>(149, Arrays.asList(Integer.valueOf('<')));
                    case '>':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList(Integer.valueOf('>')));
                    default: return null;
                }
            }
            //# line 137
            case Field: {
                switch (lookahead) {
                    case STATIC:
                        return new AbstractMap.SimpleEntry<>(151, Arrays.asList(STATIC, Type, IDENTIFIER, Integer.valueOf('('), Formals, Integer.valueOf(')'), StmtBlock));
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(152, Arrays.asList(Type, IDENTIFIER, FunctionField));
                    default: return null;
                }
            }
            default: return null;
        }
    }
    
    /**
      * Execute some user-defined semantic action on the specification file.
      * Note that `$$ = params[0], $1 = params[1], ...`. Nothing will be returned, so please
      * do not forget to store the parsed AST result in `params[0]`.
      *
      * @param id      the action id.
      * @param params  parameter array.
      */
        
    public void act(int id, SemValue[] params) {
        switch (id) {
            case 0: {
                //# line 51
                params[0].vdef = params[1].vdef;
                return;
            }
            case 1: {
                //# line 596
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 2: {
                /* no action */
                return;
            }
            case 3: {
                //# line 390
                params[0].counter = Tree.NEWSAMEARRAY;
                      params[0].loc = params[1].loc;
                return;
            }
            case 4: {
                //# line 267
                params[0].type = null;
                params[0].ident = params[2].ident;
                return;
            }
            case 5: {
                //# line 272
                params[0].type = params[1].type;
                params[0].ident = params[2].ident;
                return;
            }
            case 6: {
                //# line 316
                params[0].counter = Tree.EQ;
                params[0].loc = params[1].loc;
                return;
            }
            case 7: {
                //# line 321
                params[0].counter = Tree.NE;
                params[0].loc = params[1].loc;
                return;
            }
            case 8: {
                //# line 362
                params[0].counter = Tree.MUL;
                params[0].loc = params[1].loc;
                return;
            }
            case 9: {
                //# line 367
                params[0].counter = Tree.DIV;
                params[0].loc = params[1].loc;
                return;
            }
            case 10: {
                //# line 372
                params[0].counter = Tree.MOD;
                params[0].loc = params[1].loc;
                return;
            }
            case 11: {
                //# line 723
                if(params[1].vec != null){
                	params[0].vec.addAll(params[1].vec);
                }
                return;
            }
            case 12: {
                //# line 729
                params[0].expr2 = params[2].expr;
                return;
            }
            case 13: {
                //# line 172
                params[0].vlist = new ArrayList<VarDef>();
                params[0].vlist.add(params[1].vdef);
                if (params[2].vlist != null) {
                    params[0].vlist.addAll(params[2].vlist);
                }
                return;
            }
            case 14: {
                //# line 162
                params[0].vlist = params[1].vlist;
                return;
            }
            case 15: {
                //# line 166
                params[0].vlist = new ArrayList<VarDef>();
                return;
            }
            case 16: {
                //# line 379
                params[0].counter = Tree.NEG;
                params[0].loc = params[1].loc;
                return;
            }
            case 17: {
                //# line 384
                params[0].counter = Tree.NOT;
                params[0].loc = params[1].loc;
                return;
            }
            case 18: {
                //# line 993
                params[0].stmt = new Tree.IfSubStmt(params[1].expr, params[3].stmt, params[1].loc);
                return;
            }
            case 19: {
                //# line 652
                params[0].expr = params[1].expr;
                params[0].loc = params[1].loc;
                if (params[2].vec != null) {
                    for (SemValue v : params[2].vec) {
                        if (v.expr != null) {
                            if(v.expr1 == null){
                            	if(v.expr2 == null){
                            		params[0].expr = new Tree.Indexed(params[0].expr, v.expr, params[0].loc);
                            	}
                            	else{
                            		params[0].expr = new Tree.DefaultArray(params[0].expr, v.expr, v.expr2, params[0].loc);
                            	}	
                            }
                            else{
                            	params[0].expr = new Tree.AccessArray(params[0].expr, v.expr, v.expr1, params[0].loc);
                            }
                        } else if (v.elist != null) {
                            params[0].expr = new Tree.CallExpr(params[0].expr, v.ident, v.elist, v.loc);
                            params[0].loc = v.loc;
                        } else {
                            params[0].expr = new Tree.Ident(params[0].expr, v.ident, v.loc);
                            params[0].loc = v.loc;
                        }
                    }
                }
                return;
            }
            case 20: {
                //# line 822
                params[0].expr = params[3].expr;
                params[0].counter = 1 + params[3].counter;
                return;
            }
            case 21: {
                //# line 827
                params[0].expr = params[1].expr;
                params[0].counter = 0;
                return;
            }
            case 22: {
                //# line 527
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.NewSameArray(params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 23: {
                //# line 439
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 24: {
                //# line 309
                params[0].counter = Tree.AND;
                params[0].loc = params[1].loc;
                return;
            }
            case 25: {
                //# line 613
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 26: {
                //# line 983
                params[0].slist = new ArrayList<Tree>();
                params[0].slist.add(params[2].stmt);
                if (params[3].slist != null) {
                    params[0].slist.addAll(params[3].slist);
                }
                return;
            }
            case 27: {
                /* no action */
                return;
            }
            case 28: {
                //# line 935
                params[0].stmt = new Tree.Break(params[1].loc);
                return;
            }
            case 29: {
                //# line 451
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 30: {
                /* no action */
                return;
            }
            case 31: {
                //# line 199
                params[0].slist.add(params[1].stmt);
                params[0].slist.addAll(params[2].slist);
                return;
            }
            case 32: {
                /* no action */
                return;
            }
            case 33: {
                //# line 846
                params[0].expr = new Tree.Literal(params[1].typeTag, params[1].literal, params[1].loc);
                return;
            }
            case 34: {
                //# line 850
                params[0].expr = new Null(params[1].loc);
                return;
            }
            case 35: {
                //# line 854
                params[0].expr = params[1].expr;
                return;
            }
            case 36: {
                //# line 182
                params[0].vlist = new ArrayList<VarDef>();
                params[0].vlist.add(params[2].vdef);
                if (params[3].vlist != null) {
                    params[0].vlist.addAll(params[3].vlist);
                }
                return;
            }
            case 37: {
                /* no action */
                return;
            }
            case 38: {
                //# line 963
                params[0].stmt = new Tree.Print(params[3].elist, params[1].loc);
                return;
            }
            case 39: {
                //# line 865
                params[0].elist = new ArrayList<Tree.Expr>();
                   params[0].elist.add(params[1].expr);
                   if (params[2].elist != null) {
                       params[0].elist.addAll(params[2].elist);
                   }
                return;
            }
            case 40: {
                //# line 873
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 41: {
                //# line 929
                params[0].stmt = new Tree.ForLoop(params[3].stmt, params[5].expr, params[7].stmt, params[9].stmt, params[1].loc);
                return;
            }
            case 42: {
                //# line 742
                params[0].expr = params[1].expr;
                return;
            }
            case 43: {
                //# line 746
                params[0].expr = new Tree.ReadIntExpr(params[1].loc);
                return;
            }
            case 44: {
                //# line 750
                params[0].expr = new Tree.ReadLineExpr(params[1].loc);
                return;
            }
            case 45: {
                //# line 754
                params[0].expr = new Tree.ThisExpr(params[1].loc);
                return;
            }
            case 46: {
                //# line 758
                if (params[2].ident != null) {
                    params[0].expr = new Tree.NewClass(params[2].ident, params[1].loc);
                } else {
                    params[0].expr = new Tree.NewArray(params[2].type, params[2].expr, params[1].loc);
                }
                return;
            }
            case 47: {
                //# line 766
                params[0].expr = new Tree.TypeTest(params[3].expr, params[5].ident, params[1].loc);
                return;
            }
            case 48: {
                //# line 770
                params[0].expr = params[2].expr;
                return;
            }
            case 49: {
                //# line 774
                if (params[2].elist != null) {
                    params[0].expr = new Tree.CallExpr(null, params[1].ident, params[2].elist, params[1].loc);
                } else {
                    params[0].expr = new Tree.Ident(null, params[1].ident, params[1].loc);
                }
                return;
            }
            case 50: {
                //# line 782
                params[0].expr = new Tree.CompArray(params[2].expr, params[4].ident, params[6].expr, params[7].expr, params[1].loc);
                return;
            }
            case 51: {
                //# line 410
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 52: {
                //# line 256
                params[0].stmt = new Tree.ForeachArray(params[3].type, params[3].ident, params[5].expr, params[6].expr, params[8].stmt, params[1].loc);
                return;
            }
            case 53: {
                //# line 859
                params[0].expr = new Tree.ArrayConstant(params[2].elist, params[1].loc);
                return;
            }
            case 54: {
                //# line 799
                params[0].stmt = new Tree.Guarded(params[2].slist, params[1].loc);
                return;
            }
            case 55: {
                //# line 803
                params[0].stmt = new Tree.If(params[2].expr, params[4].stmt, params[5].stmt, params[1].loc);
                return;
            }
            case 56: {
                //# line 302
                params[0].counter = Tree.OR;
                params[0].loc = params[1].loc;
                return;
            }
            case 57: {
                //# line 943
                params[0].stmt = params[2].stmt;
                return;
            }
            case 58: {
                /* no action */
                return;
            }
            case 59: {
                //# line 539
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 60: {
                /* no action */
                return;
            }
            case 61: {
                //# line 122
                params[0].flist = new ArrayList<Tree>();
                if (params[1].vdef != null) {
                    params[0].flist.add(params[1].vdef);
                } else {
                    params[0].flist.add(params[1].fdef);
                }
                params[0].flist.addAll(params[2].flist);
                return;
            }
            case 62: {
                //# line 132
                params[0].flist = new ArrayList<Tree>();
                return;
            }
            case 63: {
                //# line 907
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[2].expr);
                params[0].elist.addAll(params[3].elist);
                return;
            }
            case 64: {
                //# line 913
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 65: {
                //# line 834
                params[0].expr = params[1].expr;
                return;
            }
            case 66: {
                //# line 838
                params[0].expr = new Tree.TypeCast(params[2].ident, params[4].expr, params[4].loc);
                return;
            }
            case 67: {
                //# line 104
                params[0].cdef = new Tree.ClassDef(params[2].ident, params[3].ident, params[5].flist, params[1].loc);
                return;
            }
            case 68: {
                //# line 109
                params[0].cdef = new Tree.Sealed(params[3].ident, params[4].ident, params[6].flist, params[1].loc);
                return;
            }
            case 69: {
                //# line 950
                params[0].stmt = new Tree.Return(params[2].expr, params[1].loc);
                return;
            }
            case 70: {
                //# line 899
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[1].expr);
                params[0].elist.addAll(params[2].elist);
                return;
            }
            case 71: {
                //# line 193
                params[0].stmt = new Tree.Block(params[2].slist, params[1].loc);
                return;
            }
            case 72: {
                //# line 154
                params[0].vlist = params[2].vlist;
                params[0].stmt = params[4].stmt;
                return;
            }
            case 73: {
                /* no action */
                return;
            }
            case 74: {
                //# line 735
                params[0].elist = params[2].elist;
                return;
            }
            case 75: {
                /* no action */
                return;
            }
            case 76: {
                //# line 396
                params[0].counter = Tree.JOINTARRAY;
                      params[0].loc = params[1].loc;
                return;
            }
            case 77: {
                //# line 29
                params[0].clist = new ArrayList<ClassDef>();
                params[0].clist.add(params[1].cdef);
                if (params[2].clist != null) {
                    params[0].clist.addAll(params[2].clist);
                }
                params[0].prog = new Tree.TopLevel(params[0].clist, params[0].loc);
                return;
            }
            case 78: {
                //# line 404
                params[0].expr = params[1].expr;
                return;
            }
            case 79: {
                //# line 511
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 80: {
                /* no action */
                return;
            }
            case 81: {
                //# line 85
                params[0].type = params[1].type;
                for (int i = 0; i < params[2].counter; ++i) {
                    params[0].type = new Tree.TypeArray(params[0].type, params[1].loc);
                }
                return;
            }
            case 82: {
                //# line 584
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 83: {
                //# line 808
                params[0].ident = params[1].ident;
                return;
            }
            case 84: {
                //# line 812
                params[0].type = params[1].type;
                for (int i = 0; i < params[3].counter; ++i) {
                    params[0].type = new Tree.TypeArray(params[0].type, params[1].loc);
                }
                params[0].expr = params[3].expr;
                return;
            }
            case 85: {
                //# line 293
                params[0].loc = params[1].loc;
                params[0].expr = params[2].expr;
                return;
            }
            case 86: {
                /* no action */
                return;
            }
            case 87: {
                //# line 115
                params[0].ident = params[2].ident;
                return;
            }
            case 88: {
                /* no action */
                return;
            }
            case 89: {
                //# line 350
                params[0].counter = Tree.PLUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 90: {
                //# line 355
                params[0].counter = Tree.MINUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 91: {
                //# line 708
                if(params[2].vec != null){
                	params[0].vec.addAll(params[2].vec);
                }
                params[0].expr2 = params[2].expr2;
                return;
            }
            case 92: {
                //# line 715
                params[0].expr1 = params[2].expr;
                if(params[4].vec != null){
                	params[0].vec.addAll(params[4].vec);
                }
                return;
            }
            case 93: {
                //# line 94
                params[0].counter = 1 + params[3].counter;
                return;
            }
            case 94: {
                //# line 98
                params[0].counter = 0;
                return;
            }
            case 95: {
                //# line 468
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 96: {
                //# line 889
                params[0].elist = params[1].elist;
                return;
            }
            case 97: {
                //# line 893
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 98: {
                //# line 57
                params[0].vdef = new Tree.VarDef(params[2].ident, params[1].type, params[2].loc);
                return;
            }
            case 99: {
                //# line 480
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 100: {
                /* no action */
                return;
            }
            case 101: {
                //# line 207
                params[0].stmt = params[1].vdef;
                return;
            }
            case 102: {
                //# line 211
                if (params[1].stmt == null) {
                    params[0].stmt = new Tree.Skip(params[2].loc);
                } else {
                    params[0].stmt = params[1].stmt;
                }
                return;
            }
            case 103: {
                //# line 219
                params[0].stmt = params[1].stmt;
                return;
            }
            case 104: {
                //# line 223
                params[0].stmt = params[1].stmt;
                return;
            }
            case 105: {
                //# line 227
                params[0].stmt = params[1].stmt;
                return;
            }
            case 106: {
                //# line 231
                params[0].stmt = params[1].stmt;
                return;
            }
            case 107: {
                //# line 235
                params[0].stmt = params[1].stmt;
                return;
            }
            case 108: {
                //# line 239
                params[0].stmt = params[1].stmt;
                return;
            }
            case 109: {
                //# line 243
                params[0].stmt = params[1].stmt;
                return;
            }
            case 110: {
                //# line 247
                params[0].stmt = new Tree.SCopyExpr(params[3].ident, params[5].expr, params[1].loc);
                return;
            }
            case 111: {
                //# line 251
                params[0].stmt = params[1].stmt;
                return;
            }
            case 112: {
                //# line 278
                if (params[2].expr == null) {
                    params[0].stmt = new Tree.Calculate(params[1].expr, params[1].loc);
                } else {
                    params[0].stmt = new Tree.Assign(params[1].expr, params[2].expr, params[2].loc);
                }
                return;
            }
            case 113: {
                //# line 286
                params[0].stmt = new Tree.VarBind(params[2].ident, params[4].expr, params[1].loc);
                return;
            }
            case 114: {
                /* no action */
                return;
            }
            case 115: {
                //# line 63
                params[0].type = new Tree.TypeIdent(Tree.INT, params[1].loc);
                return;
            }
            case 116: {
                //# line 67
                params[0].type = new Tree.TypeIdent(Tree.VOID, params[1].loc);
                return;
            }
            case 117: {
                //# line 71
                params[0].type = new Tree.TypeIdent(Tree.BOOL, params[1].loc);
                return;
            }
            case 118: {
                //# line 75
                params[0].type = new Tree.TypeIdent(Tree.STRING, params[1].loc);
                return;
            }
            case 119: {
                //# line 79
                params[0].type = new Tree.TypeClass(params[2].ident, params[1].loc);
                return;
            }
            case 120: {
                //# line 923
                params[0].stmt = new Tree.WhileLoop(params[3].expr, params[5].stmt, params[1].loc);
                return;
            }
            case 121: {
                //# line 422
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 122: {
                /* no action */
                return;
            }
            case 123: {
                //# line 555
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 124: {
                //# line 567
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 125: {
                /* no action */
                return;
            }
            case 126: {
                //# line 956
                params[0].expr = params[1].expr;
                return;
            }
            case 127: {
                /* no action */
                return;
            }
            case 128: {
                //# line 969
                params[0].slist = new ArrayList<Tree>();
                params[0].slist.add(params[1].stmt);
                if (params[2].slist != null) {
                    params[0].slist.addAll(params[2].slist);
                }
                return;
            }
            case 129: {
                //# line 977
                params[0].slist = new ArrayList<Tree>();
                return;
            }
            case 130: {
                //# line 793
                params[0].stmt = params[2].stmt;
                params[0].expr = params[2].expr;
                return;
            }
            case 131: {
                //# line 787
                params[0].expr = params[2].expr;
                return;
            }
            case 132: {
                /* no action */
                return;
            }
            case 133: {
                //# line 261
                params[0].expr = params[2].expr;
                return;
            }
            case 134: {
                /* no action */
                return;
            }
            case 135: {
                //# line 625
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 136: {
                /* no action */
                return;
            }
            case 137: {
                //# line 682
                SemValue sem = new SemValue();
                sem.expr = params[2].expr;
                sem.expr1 = params[3].expr1;
                sem.expr2 = params[3].expr2;
                params[0].vec = new Vector<SemValue>();
                params[0].vec.add(sem);
                if (params[3].vec != null) {
                    params[0].vec.addAll(params[3].vec);
                }
                return;
            }
            case 138: {
                //# line 694
                SemValue sem = new SemValue();
                sem.ident = params[2].ident;
                sem.loc = params[2].loc;
                sem.elist = params[3].elist;
                params[0].vec = new Vector<SemValue>();
                params[0].vec.add(sem);
                if (params[4].vec != null) {
                    params[0].vec.addAll(params[4].vec);
                }
                return;
            }
            case 139: {
                /* no action */
                return;
            }
            case 140: {
                //# line 642
                params[0].expr = new Tree.Unary(params[1].counter, params[2].expr, params[1].loc);
                return;
            }
            case 141: {
                //# line 646
                params[0].expr = params[1].expr;
                return;
            }
            case 142: {
                //# line 878
                params[0].elist = new ArrayList<Expr>();
                                  params[0].elist.add(params[2].expr);
                                  if (params[3].elist != null) {
                                      params[0].elist.addAll(params[3].elist);
                                  }
                return;
            }
            case 143: {
                /* no action */
                return;
            }
            case 144: {
                //# line 496
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                	Expr tmp = params[2].evec.get(0);
                    for (int i = params[2].svec.size()-1; i > 0 ; --i) {
                        tmp = new Tree.JointArray(params[2].evec.get(i-1),
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                    params[0].expr = new Tree.JointArray(params[1].expr,
                            tmp, params[2].lvec.get(0));
                }
                return;
            }
            case 145: {
                //# line 40
                params[0].clist = new ArrayList<ClassDef>();
                params[0].clist.add(params[1].cdef);
                if (params[2].clist != null) {
                    params[0].clist.addAll(params[2].clist);
                }
                return;
            }
            case 146: {
                /* no action */
                return;
            }
            case 147: {
                //# line 328
                params[0].counter = Tree.LE;
                params[0].loc = params[1].loc;
                return;
            }
            case 148: {
                //# line 333
                params[0].counter = Tree.GE;
                params[0].loc = params[1].loc;
                return;
            }
            case 149: {
                //# line 338
                params[0].counter = Tree.LT;
                params[0].loc = params[1].loc;
                return;
            }
            case 150: {
                //# line 343
                params[0].counter = Tree.GT;
                params[0].loc = params[1].loc;
                return;
            }
            case 151: {
                //# line 138
                params[0].fdef = new Tree.MethodDef(true, params[3].ident, params[2].type, params[5].vlist,
                    (Block) params[7].stmt, params[3].loc);
                return;
            }
            case 152: {
                //# line 143
                if (params[3].vlist != null) {
                    params[0].fdef = new Tree.MethodDef(false, params[2].ident, params[1].type, params[3].vlist,
                        (Block) params[3].stmt, params[2].loc);
                } else {
                    params[0].vdef = new Tree.VarDef(params[2].ident, params[1].type, params[2].loc);
                }
                return;
            }
        }
    }
}
/* end of file */
