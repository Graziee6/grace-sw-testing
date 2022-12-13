import { React } from "react";
import "./../style/CalcComponent.scss";

const CalcComponent = () => {
  return (
    <div className="calcClass">
      <h2>SimpC</h2>
      <form method="post" action="#">
        <div className="operation">
          <span>Operations:</span>
          <select name="operations" id="ops">
            <option value="+">+</option>
            <option value="-">-</option>
            <option value="/">/</option>
            <option value="*  ">*</option>
          </select>
        </div>
        <div className="operands">
          <input
            type="text"
            name="oper1"
            placeholder="1st number"
            id="op1"
            data-testid="op1"
            className="operand"
          />
          <input
            type="text"
            name="oper2"
            placeholder="2nd number"
            id="op2"
            data-testid="op2"
            className="operand"
          />
        </div>
        <div className="result">
          <input type="submit" value="Get Result" id="btn" className="btn" />
          <div id="res"></div>
        </div>
      </form>
    </div>
  );
};

export default CalcComponent;
